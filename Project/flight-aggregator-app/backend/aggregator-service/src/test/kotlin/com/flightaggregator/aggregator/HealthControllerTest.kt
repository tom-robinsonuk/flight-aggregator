package com.flightaggregator.aggregator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.server.LocalServerPort

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HealthControllerTest {

    @LocalServerPort
    private var port: Int = 0

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Test
    fun getHealthShouldReturnOK() {
        val result = restTemplate.getForObject("http://localhost:$port/health", String::class.java)
        assertThat(result).isEqualTo("OK")
    }
}
