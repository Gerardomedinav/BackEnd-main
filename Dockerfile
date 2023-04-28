FROM amazoncorretto:11-alpine-jdk
MAINTAINER GM
COPY target/gm-0.0.1-SNAPSHOT  gm-app.jar
ENTRYPOINT ["java","-jar","/gm-app.jar"]