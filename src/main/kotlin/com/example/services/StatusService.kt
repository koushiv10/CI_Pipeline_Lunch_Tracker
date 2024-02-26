package com.example.services

import com.example.Store
import com.example.struct.Error
import com.example.struct.MemberAttendance
import com.example.struct.StatusRequestBody
import io.micronaut.http.HttpResponse
import jakarta.inject.Singleton

@Singleton
class StatusService(private val store: Store) {
    fun changeStatusForTheEmployee(statusRequestBody: StatusRequestBody): HttpResponse<Any> {
        val member = store.membersList.find { it.id == statusRequestBody.id }
        if (member == null) return HttpResponse.badRequest(
            Error("Member not found")
        )
        var memberAttendance = MemberAttendance(
            member,
            statusRequestBody.date,
            statusRequestBody.status
        )
        if (store.dataList.containsKey(statusRequestBody.date)) {
            val existingMember = store.dataList[statusRequestBody.date]?.find { it.member == member }
            if (existingMember != null) store.dataList[statusRequestBody.date]!!.remove(existingMember)
        } else store.dataList[statusRequestBody.date] = ArrayList()
        store.dataList[statusRequestBody.date]!!.add(
            memberAttendance
        )
        return HttpResponse.created(memberAttendance)
    }
}