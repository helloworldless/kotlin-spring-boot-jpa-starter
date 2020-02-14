package com.davidagood.dbloadtesting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DatabaseLoadTestingApplication

fun main(args: Array<String>) {
	runApplication<DatabaseLoadTestingApplication>(*args)
}
