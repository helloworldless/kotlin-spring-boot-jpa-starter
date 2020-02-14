package com.davidagood.dbloadtesting

import java.time.OffsetDateTime
import java.time.ZoneId
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "relation")
data class Relation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    @Column(name = "parentId")
    val parentId: Int,
    @Column(name = "childId")
    val childId: Int,
    @Column(name = "createdAt")
    val createdAt: OffsetDateTime = OffsetDateTime.now(ZoneId.of("UTC"))
)
