FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY out/artifacts/deploy_jar/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]