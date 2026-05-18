# Use a lightweight JDK 25 base image
FROM eclipse-temurin:25-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Define the argument for the JAR file path
ARG JAR_FILE=target/*.jar

# Copy the built JAR file to the container and name it app.jar
COPY ${JAR_FILE} app.jar

# Expose the port your Spring Boot app listens on (default is 8080)
EXPOSE 8080

# Set the command to run the JAR file when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
