#
# Build stage
#
FROM maven:3.8.2-jdk-8 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
#FROM openjdk:11-jdk-slim
FROM openjdk:8-jdk-alpine
COPY --from=build /target/emp-1.jar emp.jar
# ENV PORT=8080
EXPOSE 7777
ENTRYPOINT ["java","-jar","emp.jar"]
