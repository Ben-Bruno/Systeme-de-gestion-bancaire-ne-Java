Banking Management System – Java Console Application

Description Application console développée en Java permettant la gestion
de comptes bancaires via une architecture orientée objet.

Le projet implémente un système bancaire simplifié avec : - Création de
comptes - Dépôt et retrait d’argent - Consultation de solde - Gestion de
différents types de comptes - Logique métier spécifique selon le type de
compte

L’objectif est de démontrer la maîtrise de la Programmation Orientée
Objet (POO) en Java, notamment l’héritage, le polymorphisme et
l’encapsulation.

Architecture du projet

Classe mère : Compte (abstraite) Attributs : - numeroCompte -
titulaire - solde

Méthodes principales : - deposer(double montant) - retirer(double
montant) - consulterSolde() - afficherDetails() - calculerInteret()
(méthode abstraite)

Classes filles :

CompteEpargne - Taux d’intérêt - Calcul des intérêts - Conditions
spécifiques de retrait

CompteEntreprise - Plafond de transaction - Autorisation de découvert
spécifique

ComptePro - Gestion des frais mensuels - Services additionnels

Concepts Java utilisés - Programmation Orientée Objet (POO) - Héritage
(extends) - Polymorphisme - Encapsulation (private, getters/setters) -
Classes abstraites - Méthodes surchargées - Gestion des exceptions -
Collections Java (ArrayList) - Manipulation console (Scanner) -
Structures conditionnelles et boucles - Organisation en packages

Structure du projet

src/ ├── model/ │ ├── Compte.java │ ├── CompteEpargne.java │ ├──
CompteEntreprise.java │ └── ComptePro.java │ ├── service/ │ └──
BanqueService.java │ └── Main.java

Fonctionnalités - Création dynamique de comptes - Stockage des comptes
en mémoire (ArrayList) - Recherche de compte par numéro - Dépôt et
retrait sécurisé - Vérification solde insuffisant - Gestion spécifique
selon le type de compte (polymorphisme) - Affichage détaillé des comptes

Gestion des erreurs - Validation des montants (montant > 0) - Gestion
solde insuffisant - Gestion exceptions utilisateur - Contrôle des
entrées console

Lancement du projet

Compilation : javac Main.java

Exécution : java Main

Objectifs pédagogiques - Maîtriser les fondamentaux de Java Core -
Comprendre l’héritage et le polymorphisme - Structurer un projet orienté
objet - Implémenter une logique métier bancaire simplifiée - Appliquer
les bonnes pratiques de structuration logicielle

Évolutions possibles - Persistance via fichiers (File I/O) - Connexion
base de données (JDBC) - Interface graphique JavaFX - Tests unitaires
JUnit - Architecture MVC - Implémentation d’un système de transactions
avancé

Auteur Bruno Bengono Étudiant ingénieur – Génie Logiciel Spécialisation
Java / Backend / Architecture logicielle
