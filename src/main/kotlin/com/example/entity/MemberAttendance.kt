package com.example.entity

import com.example.enums.Status
import jakarta.persistence.*
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable
import io.micronaut.serde.annotation.Serdeable.Deserializable
import jakarta.persistence.Entity
import java.sql.Date


@Table(
    name = "attendance"
)
@Entity
@MappedEntity
@Serdeable
@Deserializable
data class MemberAttendance(
    @Id
    val id: Int = 0,
    @Column(name = "employeeId")
    val employeeId: Int = 0,
    @Column(name = "attendance_date")
    var date: String = "",
    @Column(name = "status")
    var status: Status = Status.NOT_SPECIFIED

)
{

        constructor() : this(0, 0, "", Status.NOT_SPECIFIED)

}