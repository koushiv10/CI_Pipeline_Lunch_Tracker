package com.example

import com.example.enums.Status
import com.example.struct.Member
import com.example.struct.MemberAttendance
import io.micronaut.context.annotation.Bean
import jakarta.inject.Singleton

@Singleton
class Store {
    val membersList = ArrayList<Member>()
    val dataList = mutableMapOf<String, ArrayList<MemberAttendance>>(
        Pair(
            "25-02-2024",
            ArrayList(
                listOf(
                    MemberAttendance(Member(1, "testEmployee1"), "25-02-2024", Status.YES),
                    MemberAttendance(Member(2, "testEmployee2"), "25-02-2024", Status.YES)
                )
            )
        )
    )

    fun addMember(member: Member) {
        membersList.add(member)
        println(membersList)
    }

}