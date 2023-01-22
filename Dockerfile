FROM adoptopenjdk/openjdk8
ADD target/my-project-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]