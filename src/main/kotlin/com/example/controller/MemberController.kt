package com.example.controller

import com.example.services.MemberService
import com.example.struct.Member
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/api/member")
class MemberController(private val memberService: MemberService) {

    @Post
    fun createMember(@Body member: Member): HttpResponse<Member> =
        HttpResponse.created(memberService.createMember(member))
}