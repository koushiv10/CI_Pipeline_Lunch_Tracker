package com.example.services

import com.example.Store
import com.example.enums.Status
import com.example.struct.Member
import jakarta.inject.Singleton

@Singleton
class MemberService(private val store: Store) {

    fun createMember(member: Member): Member {
        val checkIfMemberExists = store.membersList.contains(member)
        if (!checkIfMemberExists) store.addMember(member)
        return member
    }

    fun getMemberByDate(date: String): List<Member> {
        val details = store.dataList[date]!!
        val members = mutableListOf<Member>()
        details.forEach { if (it.status == Status.YES) members.addLast(it.member)}
        return members
    }
}