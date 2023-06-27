#
# Build stage
#
FROM maven:3.9.1 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
FROM openjdk:19-alpine    
COPY --from=build /target/SampleThymleaf-0.0.1-SNAPSHOT.jar SampleThymeleaf.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","SampleThymeleaf.jar"]