# Projet Kafka/Quarkus M1

Pour lancer le projet, il faut :  
  - avoir docker d'allumé
  - aller dans le repertoire 'projet_Antonin_Carpentier'
  - `docker compose build` ou `docker-compose build`
  - `docker compose up -d` ou `docker-compose up -d`

Cela va créer : 
  - 2 producteurs
    - Ils produisent des températures en celcius
  - 1 convertisseur
    - Il convertit les  températures celcius en température fahrenheit
  - 1 consommateur
    - Il lit les températures fahrenheit 
