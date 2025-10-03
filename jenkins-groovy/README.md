# Jenkins with Groovy Configuration

A secure Jenkins setup using Docker with configurable admin credentials.

## Security Features

- 🔒 No hardcoded credentials in source code
- 🌍 Environment variable-based configuration
- 📝 `.env` file support for local development
- 🚫 `.gitignore` to prevent credential exposure

## Quick Start

### Option 1: Using Docker Compose (Recommended)

1. **Set up your credentials:**
   ```bash
   cd local-jenkins
   cp .env.example .env
   # Edit .env with your actual values
   ```

2. **Start Jenkins:**
   ```bash
   docker-compose up -d
   ```

3. **Access Jenkins:** http://localhost

### Option 2: Using Docker directly

1. **Build the image:**
   ```bash
   cd local-jenkins
   docker build -t local/jenkins .
   ```

2. **Run with custom credentials:**
   ```bash
   docker run -d --name jenkins \
     -p 80:8080 -p 50000:50000 \
     -e JENKINS_ADMIN_USER=your_username \
     -e JENKINS_ADMIN_PASSWORD=your_secure_password \
     -e JENKINS_ADMIN_EMAIL=your.email@example.com \
     local/jenkins
   ```

## Environment Variables

| Variable | Description | Default |
|----------|-------------|---------|
| `JENKINS_ADMIN_USER` | Admin username | `admin` |
| `JENKINS_ADMIN_PASSWORD` | Admin password | `admin` |
| `JENKINS_ADMIN_EMAIL` | Admin email | `admin@localhost` |

## Useful Commands

```bash
# View logs
docker logs -f jenkins

# Stop and cleanup
docker-compose down

# Rebuild after changes
docker-compose up --build -d
```

## References

- https://github.com/jenkinsci/docker/blob/master/README.md