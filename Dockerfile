FROM openjdk:21
MAINTAINER Naresh
COPY target/spring-boot-docker-app.jar  usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-docker-app.jar"]