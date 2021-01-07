FROM java:8

COPY *.jar /usr/app/MS.jar

CMD ["--server.port=9000"]

EXPOSE 9000

ENTRYPOINT ["java","-jar","/usr/app/MS.jar"]
