FROM openjdk:11

#Specify the work directory where command will run
WORKDIR /usr/src/java-app

# ADD sourceJarName destinationJarName
ADD ./target/java-docker-1.0-SNAPSHOT.jar java-docker-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","java-docker-1.0-SNAPSHOT.jar"]