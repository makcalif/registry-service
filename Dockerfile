FROM openjdk:10-jre-slim
WORKDIR /app
COPY build/libs/*.jar /app/registry-server.jar
EXPOSE 8761
CMD ["java", "-jar", "/app/registry-server.jar"]