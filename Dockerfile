FROM openjdk:17
MAINTAINER Naresh
COPY spring-boot-docker-app-0.0.1-SNAPSHOT.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-docker-app-0.0.1-SNAPSHOT.jar"]