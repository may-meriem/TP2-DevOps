# Utiliser une image Java comme base
FROM openjdk:17-jdk

#Copier le fichier JAR compilé dans l'image
ADD target/springbootapp-0.0.1-SNAPSHOT.jar /springbootapp.jar

# Exposer le port sur lequel l'application s'exécute
EXPOSE 8080

# Définir la commande pour démarrer l'application
ENTRYPOINT ["java", "-jar", "/springbootapp.jar"]





