package com.example.controller

import com.example.services.StatusService
import com.example.struct.StatusRequestBody
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/api/status")
class StatusController(private val statusService: StatusService) {

    @Post
    fun changeStatusForTheEmployee(@Body statusRequestBody: StatusRequestBody) {
        statusService.changeStatusForTheEmployee(statusRequestBody)
    }
}