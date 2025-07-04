"use client"; // This component should run in the browser, not just on the server. Used when its Live reactive not static

import React, { useState } from "react";

export default function SearchForm() {
  const [origin, setOrigin] = useState("");
  const [destination, setDestination] = useState("");
  const [departDate, setDepartDate] = useState("");
  const [results, setResults] = useState<string[]>([]);

  // Grabs the current state values (origin, destination, departDate)
  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();

    if (!origin || !destination || !departDate) {
      alert("Please fill in all fields.");
      return;
    }

    try {
      const response = await fetch("http://localhost:8080/search", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          origin,
          destination,
          departDate,
          passengers: 1,
        }),
      });

      const data: string[] = await response.json();
      console.log(`Flight results: ${data}`);
      setResults(data);
    } catch (error) {
      console.error("Error fetching flights:", error);
    }
  };

  return (
    <div className="space-y-6">
      {/* --- FORM --- */}
      <form
        onSubmit={handleSubmit}
        className="space-y-4 p-4 border rounded-md bg-white shadow"
      >
        <div>
          <label className="block font-semibold">From</label>
          <input
            type="text"
            value={origin}
            onChange={(e) => setOrigin(e.target.value)}
            className="w-full border rounded p-2"
            placeholder="e.g. LON"
          />
        </div>
        <div>
          <label className="block font-semibold">To</label>
          <input
            type="text"
            value={destination}
            onChange={(e) => setDestination(e.target.value)}
            className="w-full border rounded p-2"
            placeholder="e.g. BKK"
          />
        </div>
        <div>
          <label className="block font-semibold">Departure Date</label>
          <input
            type="date"
            value={departDate}
            onChange={(e) => setDepartDate(e.target.value)}
            className="w-full border rounded p-2"
          />
        </div>
        <button
          type="submit"
          className="bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700"
        >
          Search Flights
        </button>
      </form>
      {/* --- RESULTS --- */}
      {results.length > 0 && (
        <ul className="space-y-2">
          {results.map((flight, idx) => (
            <li key={idx} className="p-3 bg-green-100 rounded">
              {flight}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}
