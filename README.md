# Basic Project Read me for now
# ✈️ Flight Aggregator

A portfolio project that recreates a **Skyscanner‑style flight‑search aggregator** while demonstrating:

* Modern back‑end engineering with **Kotlin + Spring Boot**  
* Responsive front‑end with **Next.js 15 (TypeScript)**  
* Shift‑left quality: unit → contract → E2E (Playwright) → performance (k6)  
* GitHub Actions CI/CD, Docker, Terraform and Cloud‑native deploys  

---

## 📁 Repository Structure

```
flight-aggregator/
├── Project Management/           # Docs, design artefacts, diagrams
└── Project/
    ├── flight-aggregator-app/    # Source code (back‑end, front‑end, infra)
    │   ├── backend/
    │   │   ├── aggregator-service/
    │   │   ├── api-gateway/
    │   │   ├── provider-adapters/
    │   │   ├── user-profile-service/
    │   │   └── common-lib/
    │   ├── frontend/             # Next.js app
    │   ├── infra/                # Terraform, K8s/YAML, docker‑compose
    │   └── .github/workflows/    # CI definitions
    └── flight-aggregator-app-test/
        ├── unit/                 # JUnit5, MockK
        ├── e2e/                  # Playwright scripts
        └── perf/                 # k6 scenarios
```

*(The repo root is initialised as a single Git repository so GitHub Actions can see the whole tree.)*

---

## 🏗️ Getting Started

### Prerequisites


### Clone & Bootstrap

```bash
git clone https://github.com/tom-robinsonuk/flight-aggregator
cd flight-aggregator/Project/flight-aggregator-app

# Back‑end
./gradlew clean build

# Front‑end
cd frontend
...

```

---

## 🧪 Running Tests

| Layer | Command |
|-------|---------|


---

## 🔄 Continuous Integration

`GitHub Actions` runs on every push & PR:

---