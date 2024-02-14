FROM openjdk:8
EXPOSE 8090
ADD target/StudentEx.jar StudentEx.jar
ENTRYPOINT ["java","-jar","/StudentEx.jar"]
