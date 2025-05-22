CREATE DATABASE IF NOT EXISTS etudiant_db;

USE etudiant_db;

CREATE TABLE IF NOT EXISTS etudiants(
	id_etudiant INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nom_etudiant VARCHAR(150),
	prenom_etudiant VARCHAR(150),
    date_diplome VARCHAR(150),
    num_classe INT NOT NULL
);

SELECT * FROM etudiants;


