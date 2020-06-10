FROM openjdk:11.0.3-jre-slim-stretch
MAINTAINER Maikon Canuto
ADD ./target/mc-springboot-rabbitmq-producer-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8090
