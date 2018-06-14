FROM anapsix/alpine-java
LABEL maintainer="saikishore0305@gmail.com"
COPY C:\Users\SaiKishore\.jenkins\workspace\spring_boot\build\libs\spring_boot-0.0.1-SNAPSHOT.jar /home/spring_boot-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","-Dspring.data.mongodb.host=mongo-service","/home/spring_boot-0.0.1-SNAPSHOT.jar"]
