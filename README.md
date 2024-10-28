# 📦 Gestion de Fournitures - Backend

## Description
Ce projet est une application Java de gestion de fournitures utilisant **MongoDB** comme base de données NoSQL, et **Docker** pour exécuter MongoDB dans un environnement isolé. Le projet est structuré de manière modulaire avec **Maven** pour gérer les dépendances, et offre une interface simplifiée pour les opérations CRUD sur les fournitures, telles que la création, la lecture, la mise à jour et la suppression.

## Stack Technique

- **Langage** :  
  ![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=openjdk&logoColor=white)

- **Base de données** :  
  ![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)

- **Outils de développement** :  
  ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
  ![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
  ![MongoDB Compass](https://img.shields.io/badge/MongoDB_Compass-47A248?style=for-the-badge&logo=mongodb&logoColor=white)
  ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)

- **Version Control** :  
  ![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
  ![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)


## Fonctionnalités Principales

- **Gestion des fournitures** : Ajouter, afficher, mettre à jour et supprimer des fournitures avec des informations telles que le nom, la catégorie, la quantité et l'état.
- **Intégration MongoDB** : Stockage des données dans MongoDB, une base de données NoSQL, pour un accès rapide et flexible.
- **Docker** : Déploiement de MongoDB via Docker pour garantir l'isolation de l'environnement.
- **Visualisation des données** : Utilisation de MongoDB Compass pour vérifier les opérations en base.

## Prérequis

- **Java 21** : Pour exécuter le projet.
- **Maven 3.9.9** : Pour gérer les dépendances.
- **Docker** : Pour exécuter MongoDB en conteneur.
- **MongoDB Compass** : (optionnel) pour la visualisation des données.

## Installation et Configuration

1. **Cloner le dépôt** :
   
   ```bash
   git clone https://github.com/ThomasBerbigier/Gestion_Fournitures

3. **Configurer Docker et MongoDB** :
   - Assurez-vous que Docker est installé et en cours d'exécution.
   - Utilisez le fichier `docker-compose.yml` fourni pour configurer et démarrer MongoDB :
     
     ```bash
     docker-compose up -d
     ```
   - MongoDB sera accessible via `mongodb://localhost:27017`.

4. **Configurer l'application Java** :
   - Configurez les informations de connexion dans le fichier Java correspondant pour accéder à MongoDB sur `mongodb://localhost:27017`.

5. **Construire le projet avec Maven** :
   - Dans le répertoire du projet, exécutez la commande suivante :
     
     ```bash
     mvn clean
     mvn install
     ```

6. **Lancer l'application** :
   - Démarrez l'application en utilisant Maven :
     
     ```bash
     mvn exec:java -Dexec.mainClass="votre.package.SupplyApp"
     ```
     
7. **Opérations CRUD via MongoDB Compass** :
   - Utilisez MongoDB Compass pour visualiser les opérations CRUD sur la base de données.
   - MongoDB Compass vous permet d’examiner la collection `supplies` et de vérifier les documents ajoutés, modifiés, ou supprimés en temps réel.

---

