package com.flightaggregator.aggregator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.http.*

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SearchControllerTest {

    @LocalServerPort
    private var port: Int = 0

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Test
    fun searchShouldReturnDummyFlights() {
        val url = "http://localhost:$port/search"
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON

        val requestJson = """
            {
              "origin": "LHR",
              "destination": "BKK",
              "departDate": "2025-09-01",
              "passengers": 1
            }
        """.trimIndent()

        val entity = HttpEntity(requestJson, headers)

        val response = restTemplate.postForEntity(url, entity, Array<String>::class.java)

        assertThat(response.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(response.body).isNotNull
        assertThat(response.body!!.size).isGreaterThanOrEqualTo(1)
        assertThat(response.body!!.first()).contains("LHR", "BKK")
    }
}
