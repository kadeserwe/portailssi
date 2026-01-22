FROM eclipse-temurin:11-jre
#openjdk:11
#docker pull rootpublic/eclipse-temurin:21.0.5_11-jdk-bookworm-slim_rootio
#MAINTAINER baeldung.com
#MAINTAINER Jean Bar <amotekades@gmail.com>
#LABEL maintainer="Jean Bar <amotekades@gmail.com>"
#COPY target/SygTogoWS.jar SygTogoWS.jar
COPY target/*.jar sygtogows.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","sygtogowsimage.jar"]

#FROM alpine:3.14
#ARG JAR_FILE=target/SygTogoWS.jar
#WORKDIR /src/monjar
#COPY ${JAR_FILE} monjar.jar
#ENTRYPOINT ["java","-jar","/monjar.jar"]