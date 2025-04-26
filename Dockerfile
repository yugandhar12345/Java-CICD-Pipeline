
# Use Tomcat as base image
FROM tomcat:9.0-jdk11-openjdk

# Copy the WAR file to the Tomcat webapps folder
COPY target/welcome-message.war /usr/local/tomcat/webapps/

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
