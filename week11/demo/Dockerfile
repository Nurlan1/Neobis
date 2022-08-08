# base docker image
FROM openjdk:18
LABEL maintainer="javaguides.net"
ADD target/demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
ENTRYPOINT ["java","-jar", "springboot-docker-demo.jar"]