package com.example.services
import com.example.entity.MemberAttendance
import com.example.repository.AttendanceRepository
import jakarta.inject.Singleton
import java.sql.Date

@Singleton
class AttendanceServiceDB(private val attendanceRepository: AttendanceRepository) {

    fun getEmployeeIdsByDate(date: String): List<Int> {
        return attendanceRepository.findAllEmployeeIdByDate(date)
    }

    fun addAttendanceRecord(attendanceRecord: MemberAttendance) {
        attendanceRepository.save(attendanceRecord)
    }


}
