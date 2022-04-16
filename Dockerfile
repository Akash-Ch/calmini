FROM openjdk:8
COPY  ./target/calmini-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "calmini-1.0-SNAPSHOT-jar-with-dependencies.jar"]