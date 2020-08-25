FROM openjdk:12-oraclelinux7
VOLUME /tmp
EXPOSE 8080
ADD target/*.jar jpa-clientes-spring-0.0.1-SNAPSHOT.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /jpa-clientes-spring-0.0.1-SNAPSHOT.jar" ]