# FROM openjdk:17-jdk-slim

# WORKDIR /app

# COPY target/codekamikaze-1.0.0.jar app.jar

# EXPOSE 8080

# ENTRYPOINT ["java", "-jar", "app.jar"]
# Use official Tomcat base image
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8080

CMD java -jar app.jar && sleep infinity
