# FROM openjdk:17-jdk-slim

# WORKDIR /app

# COPY target/codekamikaze-1.0.0.jar app.jar

# EXPOSE 8080

# ENTRYPOINT ["java", "-jar", "app.jar"]
# Use official Tomcat base image
FROM tomcat:9.0

# Clean the default apps (optional, keeps it clean)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file into Tomcat's webapps directory
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose Tomcat port
EXPOSE 8080

# No need for custom entrypoint; Tomcat starts automatically
