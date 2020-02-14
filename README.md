# Database Load Testing

## Running Locally
1. Make sure Postgres is running locally with default settings (see instructions below)
1. Run `com/davidagood/dbloadtesting/DatabaseLoadTestingApplication.kt` or run `./gradlew bootRun`
1. Starts @ [http://localhost:8080](http://localhost:8080)
1. Supports basic CRUD operations:
    1. `GET /relation`
    1. `POST /relation?parent=<parentId>&child=<childId>`
    1. `DELETE /relation`
1. Supports seeding an arbitrary number of relations:
    `POST /seed/{count}`
    
## Build
Run `./gradlew build`

## Running Postgres with Docker

- `docker run -d --name db-load-test -v db-load-test-data:/var/lib/postgresql/data -p 5432:5432 postgres:latest`
- `docker logs -f db-load-test`
- `docker exec -it db-load-test psql -U postgres`
    - `\l` to list databases
    - `CREATE DATABASE test;`
    - `\c test` to change to `test` database
    - `INSERT INTO relation(id, parentId, childId) VALUES (2, 2, 3);`
    - `INSERT INTO relation(id, parentId, childId, createdAt) VALUES (1, 1, 2, timezone('UTC'::text, now()));`
    - `SELECT * FROM relation;`
