FROM adoptopenjdk:8-jdk-alpine

EXPOSE 8080

ADD build/libs/Authorization-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]