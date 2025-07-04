package com.flightaggregator.aggregator.controller

import com.flightaggregator.aggregator.model.SearchRequest
import org.springframework.web.bind.annotation.*

@RestController // Tells Spring this class handles API Calls and returns JSON/text...
@RequestMapping("/search") // Sets the URL
class SearchController {
    @PostMapping
    fun search(@RequestBody request: SearchRequest): List<String> {
        println("Received search: $request");
        // Returns a fake list of flight options for now (just so we can test end-to-end)
        return listOf(
            "Flight 1: ${request.origin} -> ${request.destination}",
            "Flight 2: ${request.origin} -> ${request.destination} (via DXB)"
        )
    }
}