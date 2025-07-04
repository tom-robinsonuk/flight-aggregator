package com.flightaggregator.aggregator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AggregatorServiceApplication

fun main(args: Array<String>) {
	runApplication<AggregatorServiceApplication>(*args)
}
