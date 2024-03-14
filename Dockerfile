FROM eclipse-temurin:17
COPY target/webappp.jar webappp.jar
CMD ["java","-jar","webappp.jar"]