package com.davidagood.kotlinspringbootjpa

import org.springframework.data.jpa.repository.JpaRepository


interface RelationRepository : JpaRepository<Relation?, Relation?>
