FROM openjdk:17-jdk-alpine
VOLUME /tmp
EXPOSE 8082
ARG JAR_FILE=target/departament-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
