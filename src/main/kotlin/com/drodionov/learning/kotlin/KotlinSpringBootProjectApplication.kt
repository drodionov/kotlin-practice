package com.drodionov.learning.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootProjectApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootProjectApplication>(*args)
}
