package com.drodionov.learning.kotlin.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/hello")
class HelloController {

    @GetMapping("/{name}")
    fun hello(@PathVariable name: String): String {
        return "Hello $name!"
    }
}