# ---------- Build Stage ----------
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Set working directory inside the container
WORKDIR /app

# Copy Maven config and source code (more efficient)
COPY pom.xml .
COPY src ./src

# Build the project and skip tests to speed up
RUN mvn clean package -DskipTests

# ---------- Run Stage ----------
FROM eclipse-temurin:17-jdk-jammy

# Set working directory
WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/target/rohanhotel-0.0.1-SNAPSHOT.jar app.jar

# Expose port your Spring Boot app listens on (4040 as per your properties)
EXPOSE 4040

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]