package com.example.repository

import com.example.entity.Member
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface MemberRepository : CrudRepository<Member, Int>