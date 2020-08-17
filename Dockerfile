FROM openjdk:11-oracle
MAINTAINER Andrew Nguyen (Andrew.Nguyen@cra-arc.gc.ca)
RUN apt-get update
RUN apt-get install -y maven
RUN mvn package