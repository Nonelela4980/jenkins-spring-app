FROM maven:eclipse-temurin-18-alpine

RUN mkdir /jenkins-spring-app
WORKDIR /jenkins-spring-app

COPY ./pom.xml ./pom.xml

COPY ./src ./src

RUN mvn verify --fail-never

#RUN unit tests
RUN mvn clean test
#Build jar
RUN mvn clean install package

RUN mv ./target/jenkins-spring-app-0.0.1-SNAPSHOT.jar ./release-0.0.1-SNAPSHOT.jar

EXPOSE 9635

CMD ["java", "-jar", "./release-0.0.1-SNAPSHOT.jar"]
