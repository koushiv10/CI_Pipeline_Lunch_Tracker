package com.example.struct

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class Error(val error: String)
