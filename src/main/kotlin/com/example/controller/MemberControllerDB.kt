package com.example.controller

import com.example.entity.Member
import com.example.services.MemberServiceDB
import io.micronaut.http.annotation.*

@Controller("/Members")
class MemberControllerDB(private val memberService: MemberServiceDB) {

    @Get("/")
    fun getMembers(): Iterable<Member> {
        return memberService.findAllMembers()
    }

    @Get("/{id}")
    fun getMemberById(id: Int): Member? {
        return memberService.findMemberById(id)
    }

    @Post("/")
    fun createMember(@Body member: Member): Member {
        return memberService.createMember(member)
    }


    @Delete("/{id}")
    fun deleteMember(id: Int) {
        memberService.deleteMember(id)
    }
}
