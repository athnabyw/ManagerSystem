FROM java:8

WORKDIR /usr/app

COPY *.jar /usr/app/springboot-04-mangersystem-0.0.1-SNAPSHOT.jar

CMD ["--server.port=9000"]

EXPOSE 9000

ENTRYPOINT ["java","-jar","/usr/app/springboot-04-mangersystem-0.0.1-SNAPSHOT.jar"]