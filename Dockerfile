FROM openjdk:17
MAINTAINER Naresh
COPY spring-boot-docker-app-3.2.2.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-docker-app-3.2.2.jar"]