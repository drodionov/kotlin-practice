package com.drodionov.learning.kotlin.web.api

import com.drodionov.learning.kotlin.config.ApplicationProperties
import mu.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/hello")
class HelloController(val configurationService: ApplicationProperties) {

    companion object: KLogging()

    @GetMapping("/{name}")
    fun hello(@PathVariable name: String): String {
        logger.info("Log this line with INFO severity")
        return "Hello $name! Here is your property: ${configurationService.property}"
    }
}