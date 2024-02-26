package com.example

import com.example.enums.Status
import com.example.services.MemberService
import com.example.services.StatusService
import com.example.struct.Error
import com.example.struct.Member
import com.example.struct.MemberAttendance
import com.example.struct.StatusRequestBody
import io.micronaut.http.HttpResponse
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@Suppress("UNCHECKED_CAST")
@MicronautTest
class AppTest {
    private lateinit var store: Store

    @BeforeEach
    fun init() {
        store = Store()
    }

    @Test
    fun `Member Data should be saved in memory`() {
        val memberService = MemberService(store)
        val member = Member(1, "Vyankatesh")
        memberService.createMember(member)
        val checkContains: Boolean = store.membersList.contains(Member(1, "Vyankatesh"))
        Assertions.assertTrue(checkContains)
    }

    @Test
    fun `Member should not be added to the memory if member already exists in memory`() {
        val memberService = MemberService(store)
        val member = Member(1, "Vyankatesh")
        memberService.createMember(member)
        memberService.createMember(member)
        Assertions.assertEquals(1, store.membersList.size)
    }


    // Test case for creating a member
    @Test
    fun `test to create a Member`() {
        val memberService = MemberService(store)
        val member = Member(1, "John Doe")
        val createdMember = memberService.createMember(member)
        Assertions.assertEquals(member, createdMember)
    }

    @Test
    fun `Should throw error for adding response for a member which does not exists in a system`() {
        val statusService = StatusService(store)
        val response = statusService.changeStatusForTheEmployee(
            StatusRequestBody(
                "25/02/2024",
                1,
                Status.YES
            )
        ) as HttpResponse<Error>
        Assertions.assertEquals("Member not found", response.body().error)
    }
    @Test
    fun `Should save the response of the member`() {
        val statusService = StatusService(store)
        val member = Member(1, "Vyankatesh")
        store.addMember(member)
        val response = statusService.changeStatusForTheEmployee(
            StatusRequestBody(
                "25/02/2024",
                1,
                Status.YES
            )
        ) as HttpResponse<MemberAttendance>
        val size = store.dataList["25/02/2024"]?.size
        Assertions.assertEquals(1, size)
    }
    @Test
    fun ` test to create a member using mockk object`() {
        // Given
        val store = mockk<Store>()
        val memberService = MemberService(store)
        val member = Member(1, "John Doe")

        // Mock the behavior of Store
        every { store.membersList.contains(member) } returns false
        every { store.addMember(member) } returns Unit

        // When
        val createdMember = memberService.createMember(member)

        // Then
        assertEquals(member, createdMember)
    }
}