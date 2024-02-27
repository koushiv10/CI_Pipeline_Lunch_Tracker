package com.example.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.io.FileReader

@Controller("/")
class loginPage {
    @Get(produces = [MediaType.TEXT_HTML])
    fun displayLogin(): MutableHttpResponse<String>? {
        var content = FileReader("/Users/vasangik/Desktop/CI_Pipeline_Lunch_Tracker/src/main/resources/index.html").readText()
        return HttpResponse.ok(content);
    }
}

@Controller("/member")
class memberPage {
    @Get(produces = [MediaType.TEXT_HTML])
    fun displayLogin(): MutableHttpResponse<String>? {
        var content = FileReader("/Users/vasangik/Desktop/CI_Pipeline_Lunch_Tracker/src/main/resources/member.html").readText()
        return HttpResponse.ok(content);
    }
}

@Controller("/admin")
class adminPage {
    @Get(produces = [MediaType.TEXT_HTML])
    fun displayLogin(): MutableHttpResponse<String>? {
        var content = FileReader("/Users/vasangik/Desktop/CI_Pipeline_Lunch_Tracker/src/main/resources/admin.html").readText()
        return HttpResponse.ok(content);
    }
}