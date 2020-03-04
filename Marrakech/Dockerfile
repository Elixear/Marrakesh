FROM openjdk:8-jre-alpine

COPY target/*.jar /app.jar

CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=test", "/app.jar"]