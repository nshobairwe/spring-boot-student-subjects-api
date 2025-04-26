# Use official OpenJDK 21 image
FROM openjdk:21-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Set environment variables for MySQL (optional, if needed)
ENV SPRING_DATASOURCE_URL=jdbc:mysql://db:3306/mystudent
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=%01Witne@

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
