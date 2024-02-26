package com.example.struct

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class Member(val id: Int, val name: String)

