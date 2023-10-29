# Use an official OpenJDK runtime as a parent image
FROM openjdk:8-jre-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
#COPY target/*.jar KaddemProject-1.0.jar
RUN curl -o KaddemProject-1.0.jar "http://192.168.33.10:8081/repository/maven-releases/"
# Expose the port your Spring Boot application will run on (adjust if needed)
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "KaddemProject-1.0.jar"]
