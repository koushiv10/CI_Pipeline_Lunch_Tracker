package com.example.struct

import com.example.enums.Status
import io.micronaut.serde.annotation.Serdeable

@Serdeable
class MemberAttendance(val member: Member, val date: String, var status: Status)
