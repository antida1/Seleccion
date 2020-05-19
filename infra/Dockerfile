FROM openjdk:11

MAINTAINER ldavid ldavid@personalsoft.com.co

RUN mkdir /app
ADD ./build/libs/seleccion-1.0.jar /app/seleccion-1.0.jar
ENTRYPOINT ["java","-jar","/app/seleccion-1.0.jar"]
