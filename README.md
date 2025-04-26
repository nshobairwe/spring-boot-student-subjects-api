Here’s the **modified and clean** version of your `README.md`:

---

# spring-boot-students-subjects-api

A Spring Boot REST API to manage students and subjects, now with Docker support.

## Features
- Retrieve a list of students with their enrolled programs.
- Retrieve subjects for the Software Engineering program (Years 1–4).
- Use Spring Boot, MySQL, and JPA for database management.
- Dockerized for easy containerized deployment.

## Setup Instructions

### Prerequisites
- Java 17+
- Maven
- MySQL
- Docker & Docker Compose
- Git

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/spring-boot-students-api.git
   cd spring-boot-students-api
   ```

### Running with Docker
1. Build and start the containers:
   ```bash
   docker-compose up --build
   ```

2. View container logs:
   ```bash
   docker logs <container_name> > docker_logs.txt
   ```

3. Push Docker images to Docker Hub (optional):
   ```bash
   docker push your-dockerhub-username/demo-api
   ```
### Server Management Scripts for AWS Ubuntu Server
1. `health_check.sh` — Monitor server resource usage and API status.
2. `backup_api.sh` — Backup API project files and database.
3. `update_server.sh` — Automate server and API updates.

### Files Added
- `Dockerfile` — Defines how the Spring Boot API container is built.
- `docker-compose.yml` — Orchestrates the API and MySQL containers.
- `docker_logs.txt` — Example log output captured from running containers.



