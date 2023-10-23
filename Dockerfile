# Use an official OpenJDK runtime as a parent image
FROM openjdk:8-jre-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/*.jar KaddemProject-1.0.jar

# Expose the port your Spring Boot application will run on (adjust if needed)
EXPOSE 9090

# Define the command to run your application
CMD ["java", "-jar", "KaddemProject-1.0.jar"]
