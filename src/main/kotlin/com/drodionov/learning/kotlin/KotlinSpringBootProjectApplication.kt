package com.drodionov.learning.kotlin

import com.drodionov.learning.kotlin.config.ApplicationProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties::class)
class KotlinSpringBootProjectApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringBootProjectApplication>(*args)
}
