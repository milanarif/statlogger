FROM openjdk:11-jre-slim-buster

COPY ./target/logger-1.jar /usr/src/logger/

WORKDIR /usr/src/logger

ENTRYPOINT ["java","-jar","logger-1.jar"]