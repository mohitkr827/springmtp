
FROM openjdk:23-jdk


WORKDIR /app

COPY target/springmtp-0.0.1-SNAPSHOT.jar app.jar
COPY .env .env


EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
