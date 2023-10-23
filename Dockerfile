# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY *.jar KaddemProject-1.0.jar

# Expose the port your Spring Boot application will run on (adjust if needed)
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "KaddemProject-1.0.jar"]
