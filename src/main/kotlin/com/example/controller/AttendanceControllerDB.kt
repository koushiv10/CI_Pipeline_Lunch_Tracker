package com.example.controller

// Import statements and the rest of the code for AttendanceControllerDB

import com.example.entity.MemberAttendance
import com.example.services.AttendanceServiceDB
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import java.sql.Date


@Controller("/attendance")
class AttendanceControllerDB(private val attendanceService: AttendanceServiceDB) {

    @Get("/{date}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getEmployeeIdsByDate(date: String): List<Int> {
        return attendanceService.getEmployeeIdsByDate(date)
    }

    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    fun addAttendanceRecord(@Body attendanceRecord: MemberAttendance): HttpStatus {
        attendanceService.addAttendanceRecord(attendanceRecord)
        return HttpStatus.CREATED
    }

}
