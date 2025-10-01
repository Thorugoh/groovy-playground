## Commands

`docker pull jenkins/jenkins:lts-jdk17`

`docker run -d --name jenkins -p 80:8080 -p 50000:50000 jenkins/jenkins:lts-jdk17`

`docker ps`

` docker logs -f jenkins`

`docker build -t local/jenkins .`

## Refereneces

https://github.com/jenkinsci/docker/blob/master/README.md