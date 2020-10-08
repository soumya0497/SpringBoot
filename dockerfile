FROM spring-boot:spring
ADD /springbootapp.jar springapp.jar
ENTRYPOINT ["java", "-jar", "springapp.jar"]
EXPOSE 8080
