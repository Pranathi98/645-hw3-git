FROM ubuntu
RUN apt-get update && apt-get install -y openjdk-17-jdk && apt-get install -y unzip
RUN mkdir test

COPY SWE645-Ast3.war /test
RUN unzip test/SWE645-Ast3.war
CMD ["bash"]
#COPY ./target/swe645hw3-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
#CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
# CMD ["/usr/bin/java", "-jar", "/target/swe645hw3-0.0.1-SNAPSHOT.jar"]


