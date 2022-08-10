# base docker image
FROM openjdk:18
ENV SPRING_DATASOURCE_URL=jdbc:mysql://db4free.net:3306/bookdb1 \
MYSQL_HOST=db4free.net \
MYSQL_USER=nurlan1 \
MYSQL_PASSWORD=11111111
LABEL maintainer="javaguides.net"
ADD target/demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "springboot-docker-demo.jar"]