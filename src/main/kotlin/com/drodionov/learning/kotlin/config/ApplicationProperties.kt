package com.drodionov.learning.kotlin.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "kotlin.practice")
data class ApplicationProperties(val property: String)