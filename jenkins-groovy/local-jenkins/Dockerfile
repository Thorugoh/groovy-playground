FROM jenkins/jenkins:lts-jdk17
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"

# Set default values for Jenkins admin credentials (override these when running the container)
ENV JENKINS_ADMIN_USER=admin
ENV JENKINS_ADMIN_PASSWORD=admin
ENV JENKINS_ADMIN_EMAIL=admin@localhost

COPY security.groovy /usr/share/jenkins/ref/init.groovy.d/security.groovy
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli --plugin-file /usr/share/jenkins/ref/plugins.txt

COPY seeddsl.groovy /usr/share/jenkins/seeddsl.groovy
COPY config.xml /usr/share/jenkins/seed-job-config.xml
COPY create-seed-job.groovy /usr/share/jenkins/ref/init.groovy.d/create-seed-job.groovy