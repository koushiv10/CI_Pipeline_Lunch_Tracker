package com.example.entity

import jakarta.persistence.*
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable
import jakarta.persistence.Entity

@Table(
    name = "members"
)
@Entity
@MappedEntity
@Serdeable
data class Member(
    @Id
    val id: Int = 0,
    @Column(name = "name")
    var name: String = "",
){}