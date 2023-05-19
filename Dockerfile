FROM openjdk:19
VOLUME /tmp
COPY target/*.jar chatbot.jar
ENTRYPOINT ["java", "-jar", "/chatbot.jar" ]