package com.davidagood.dbloadtesting

import org.springframework.data.jpa.repository.JpaRepository


interface RelationRepository : JpaRepository<Relation?, Relation?>
