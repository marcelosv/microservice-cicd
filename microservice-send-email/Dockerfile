FROM openjdk:8-jre-alpine
VOLUME /tmp
ADD /target/microservicecicd-send-email.jar app.jar
ENTRYPOINT ["java","-Xms1024m", "-Xmx1024m", "-XX:-UseGCOverheadLimit","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]