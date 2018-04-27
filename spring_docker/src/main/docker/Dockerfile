FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD spring_docker-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
