FROM openjdk:8-jre-alpine

ARG JAR_FILE

COPY target/lib           /usr/share/example/lib
COPY target/${JAR_FILE} /usr/share/example/app.jar

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/example/app.jar"]
