package com.example.repository

import com.example.entity.MemberAttendance
import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import java.sql.Date


@Repository
interface AttendanceRepository : CrudRepository<MemberAttendance, Int> {
//    fun findEmployeeIdsByDate(date: Date): List<Int>
    fun findAllEmployeeIdByDate(date: String): List<Int>
}