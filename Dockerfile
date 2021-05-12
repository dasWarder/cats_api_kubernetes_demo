FROM alpine:3.13.5

ARG FILE_NAME=target/*.jar

RUN apk add openjdk11
COPY $FILE_NAME /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
