package com.davidagood.kotlinspringbootjpa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootJpaStarterApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootJpaStarterApplication>(*args)
}
