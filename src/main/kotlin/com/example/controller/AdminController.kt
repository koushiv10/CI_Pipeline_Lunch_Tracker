package com.example.controller

import com.example.services.MemberService
import com.example.struct.Member
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import java.text.SimpleDateFormat
import java.util.*

@Controller("/api/admin")
class AdminController(private val memberService: MemberService) {

    @Get
    fun createMember(): HttpResponse<List<Member>> {
        val formatter = SimpleDateFormat("yyyy-MM-dd")
        val currentDate = formatter.format(Date())
        return HttpResponse.created(memberService.getMemberByDate(currentDate), )
    }
}