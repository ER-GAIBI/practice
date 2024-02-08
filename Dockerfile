FROM openjdk:11
LABEL authors="ergai"

WORKDIR /usr/src/app

COPY /src/practice.jar /usr/src/app/

CMD ["java", "-jar", "practice.jar"]