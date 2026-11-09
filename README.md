# 🌐 FleetManager Web — Gestion de parc automobile (Jakarta EE)

Version **web** de [FleetManager Pro](https://github.com/traorecharles/FleetManagerPro-JavaFX) : application Jakarta EE (Servlets + JSP/JSTL) pour gérer véhicules, missions, affectations et entretiens.

![Java](https://img.shields.io/badge/Java-17-orange) ![Jakarta EE](https://img.shields.io/badge/Jakarta%20EE-10-blue) ![MySQL](https://img.shields.io/badge/MySQL-8-4479A1) ![Maven](https://img.shields.io/badge/build-Maven%20WAR-C71A36)

## Fonctionnalités

- **Tableau de bord** (`/dashboard`) : vue synthétique du parc
- **Véhicules** (`/vehicules`) : liste, ajout, modification, suppression
- **Missions** (`/missions`), **Affectations** (`/affectations`), **Entretiens** (`/entretiens`)
- Layout partagé (en-tête + menu latéral) via des fragments JSP

## Stack technique

- Java 17, **Jakarta EE 10** (Servlets, JSP, JSTL 3)
- **MySQL 8** via JDBC
- Packaging **WAR** avec Maven, serveur compatible Jakarta (Tomcat 10.1+, GlassFish 7, Payara 6…)
- Architecture en couches : `model` → `service` (DatabaseService) → `servlet` → `JSP`

## Structure

```
src/main
├── java/com/miage/fleet
│   ├── model/      # Vehicle, Mission, Affectation, Entretien, User
│   ├── service/    # DatabaseService (accès MySQL)
│   ├── servlet/    # contrôleurs HTTP
│   └── util/       # DatabaseConnection
├── resources/database.properties
└── webapp/         # pages JSP + WEB-INF (web.xml, includes/)
```

## Installation

1. **Prérequis** : JDK 17+, Maven, MySQL 8, Tomcat 10.1+.
2. **Base de données** : utiliser le schéma `fleet_manager.sql` du dépôt [FleetManagerPro-JavaFX](https://github.com/traorecharles/FleetManagerPro-JavaFX) (même modèle de données).
3. **Configurer** `src/main/resources/database.properties`.
4. **Construire** :
   ```bash
   mvn clean package
   ```
5. **Déployer** `target/FleetManagerWeb-1.0-SNAPSHOT.war` sur Tomcat puis ouvrir `http://localhost:8080/FleetManagerWeb-1.0-SNAPSHOT/dashboard`.

## Pistes d'amélioration

- Authentification et gestion des rôles côté web
- Tests automatisés (JUnit + base de test)
- Pool de connexions (HikariCP)

## Auteur

**Charles Traoré** — projet MIAGE.
