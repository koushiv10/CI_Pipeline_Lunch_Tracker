package com.example.struct

import com.example.enums.Status
import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class StatusRequestBody(val date: String, val id: Int, val status: Status)
