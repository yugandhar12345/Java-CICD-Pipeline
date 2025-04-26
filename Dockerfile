# FROM openjdk:17-jdk-slim

# WORKDIR /app

# COPY target/codekamikaze-1.0.0.jar app.jar

# EXPOSE 8080

# ENTRYPOINT ["java", "-jar", "app.jar"]
FROM openjdk:17-jdk-slim

WORKDIR /app

# Update the JAR filename here to match the generated file name
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
