package com.example.services
import com.example.entity.Member
import com.example.repository.MemberRepository
import jakarta.inject.Singleton
@Singleton
class MemberServiceDB(private val memberRepository: MemberRepository) {

    fun findAllMembers(): Iterable<Member> {
        return memberRepository.findAll()
    }

    fun findMemberById(id: Int): Member? {
        return memberRepository.findById(id).orElse(null)
    }

    fun createMember(member: Member): Member {
        return memberRepository.save(member)
    }

    fun deleteMember(id: Int) {
        memberRepository.deleteById(id)
    }
}
