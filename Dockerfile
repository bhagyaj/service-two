from java:8
expose 8080
add /target/service-b-1.0-SNAPSHOT.jar /opt/service-b-1.0-SNAPSHOT.jar
workdir /opt
entrypoint ["java","-jar","service-b-1.0-SNAPSHOT.jar"]

