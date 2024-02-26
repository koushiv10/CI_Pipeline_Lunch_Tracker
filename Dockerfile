# Use a base image with JDK installed
FROM openjdk:11
# Set the working directory inside the container
WORKDIR /app
# Copy the JAR file from the build artifacts into the container
COPY build/libs/*.jar app.jar
# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]