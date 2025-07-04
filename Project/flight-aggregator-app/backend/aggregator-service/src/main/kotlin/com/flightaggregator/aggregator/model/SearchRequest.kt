package com.flightaggregator.aggregator.model


//  "data class" – a compact way to hold input data (like a struct or JSON model).
data class SearchRequest(
    val origin: String,
    val destination: String,
    val departDate: String,
    val returnData: String ? = null,
    val passengers: Int = 1,
    val cabinClass: String = "ECONOMY"
)