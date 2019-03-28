FROM openjdk:8-jre-alpine

COPY target/lib /target/lib
COPY target/test-classes /target/test-classes

WORKDIR /target

ENTRYPOINT ["java", "-classpath", "lib/*:test-classes", "org.junit.platform.console.ConsoleLauncher", "--scan-class-path"]

