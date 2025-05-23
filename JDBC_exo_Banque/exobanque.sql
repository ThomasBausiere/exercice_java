-- Création de la base de données
CREATE DATABASE IF NOT EXISTS banque;
USE banque;

-- Table Customer
CREATE TABLE IF NOT EXISTS Customer (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_first_name VARCHAR(50) NOT NULL,
    customer_last_name VARCHAR(50) NOT NULL,
    customer_phone VARCHAR(10) NOT NULL
);

-- Table BankAccount
CREATE TABLE IF NOT EXISTS BankAccount (
    bank_account_id INT AUTO_INCREMENT PRIMARY KEY,
    bank_account_total_amount FLOAT NOT NULL,
    customer_id INT NOT NULL,
    CONSTRAINT fk_id_customer FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
);

-- Table Operation
CREATE TABLE IF NOT EXISTS Operation (
    operation_id INT AUTO_INCREMENT PRIMARY KEY,
    operation_amount FLOAT NOT NULL,
    operation_status BOOLEAN,
    bank_account_id INT NOT NULL,
    CONSTRAINT fk_bank_account_id FOREIGN KEY (bank_account_id) REFERENCES BankAccount(bank_account_id)
);
