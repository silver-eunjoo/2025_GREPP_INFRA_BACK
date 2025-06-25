FROM openjdk:21-slim

WORKDIR /app

ARG JAR_DIR=/build/libs/*.jar

COPY ${JAR_DIR} app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]