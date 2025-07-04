# ✈️ Flight Aggregator – Mono‑Repo

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
    │   └── .github/workflows/    # CI definitions (needs to move up)
    └── flight-aggregator-app-test/
        ├── unit/                 # JUnit5, MockK
        ├── e2e/                  # Playwright scripts
        └── perf/                 # k6 scenarios
```

---

## ✅ API Endpoints

| Method | Endpoint       | Description              |
|--------|----------------|--------------------------|
| GET    | `/health`      | Health check (returns OK)|
| POST   | `/search`      | Accepts search request and returns mock flights |

---

## 🏗️ Getting Started

### Prerequisites

| Tool         | Version (tested) |
|--------------|------------------|
| Java         | 17+              |


### Clone & Bootstrap

```bash
git clone https://github.com/your-handle/flight-aggregator.git
cd flight-aggregator/Project/flight-aggregator-app

# Back‑end
cd backend/aggregator-service
./gradlew build

# Front‑end
cd ../../frontend
pnpm install
pnpm dev
```

---

## 🧪 Running Tests

```bash
# From aggregator-service directory
./gradlew test
```

---

## 🔄 Continuous Integration

---
