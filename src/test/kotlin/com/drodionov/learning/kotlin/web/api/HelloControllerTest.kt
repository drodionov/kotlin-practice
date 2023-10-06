package com.drodionov.learning.kotlin.web.api

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.reactive.server.WebTestClient

@ActiveProfiles("test")
@AutoConfigureWebTestClient
@SpringBootTest(webEnvironment = RANDOM_PORT)
class HelloControllerTest {

    @Autowired
    lateinit var webTestClient: WebTestClient

    @Test
    fun hello() {
        val helloString = webTestClient.get().uri("/v1/hello/test").exchange()
            .expectStatus().is2xxSuccessful
            .expectBody(String::class.java)
            .returnResult().responseBody

        Assertions.assertEquals("Hello test! Here is your property: Dummy test prop", helloString)
    }
}