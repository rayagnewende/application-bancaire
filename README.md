# Application Bancaire

**Application de gestion bancaire codée en Java (Maven)** permettant de simuler les opérations principales d’une banque : création de comptes, consultation des soldes, dépôts, retraits, virements, etc.

---

##  Fonctionnalités

✔️ Création, suppression et consultation de comptes  
✔ Dépôt et retrait d’argent  
✔ Virements entre comptes  
✔ Gestion des utilisateurs (si applicable)  
✔ Architecture modulaire pour faciliter les évolutions futures

---

##  Architecture du projet

Ce projet est structuré en modules :

📂 **model**  
👉 Contient les classes métier représentant les entités bancaires (Compte, Client, Transaction, …)

📂 **service**  
👉 Logique métier (gestion des opérations bancaires)

📂 **repository / dao**  
👉 Accès aux données / gestion persistante

📂 **ui / main**  
👉 Point d’entrée de l’application

---

## 🛠 Tech Stack

- Java 17
- Spring boot                                                                                                                                                   
- Spring SECURITY
- Spring data JPA
- Hibernate
- THYMELEAF
- Maven
- POSTGRE SQL 
- (Si applicable) Framework web ou interface graphique  
- Tests unitaires avec JUnit  
- Gestion des dépendances avec Maven

---

## 📦 Installation

1. Clone le dépôt  
   ```bash
   git clone https://github.com/rayagnewende/application-bancaire.git
