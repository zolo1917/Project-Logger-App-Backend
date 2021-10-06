FROM openjdk:11
LABEL Adwaith=<adwaith_venkatesh@msn.com>

ARG JAR_FILE=target/UserService-*.jar

WORKDIR opt/app
# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]

CMD [""]