FROM ubuntu:latest
MAINTAINER Andrew Nguyen (Andrew.Nguyen@cra-arc.gc.ca)
WORKDIR /app

RUN echo "Hello World"

#install necessary libraries
RUN apt-get update
RUN apt-get install -y maven

#copy the pom dependency file
COPY pom.xml ./
RUN mvn dependency:resolve

#copy the rest of the file and build
COPY . ./
RUN mvn package