-- Create schema
CREATE SCHEMA IF NOT EXISTS bms;
USE bms;

-- Create account table
CREATE TABLE IF NOT EXISTS account (
    Acc VARCHAR(10) PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    DOB DATE NOT NULL,
    Password VARCHAR(255) NOT NULL,
    Acc_Type VARCHAR(50) NOT NULL,
    Nationality VARCHAR(50) NOT NULL,
    Caste VARCHAR(50),
    Gender CHAR(1) NOT NULL,
    Mobile VARCHAR(15) NOT NULL,
    Landline VARCHAR(15),
    Address VARCHAR(255),
    Branch VARCHAR(100),
    Balance DECIMAL(10, 2) NOT NULL
);

-- Create balance table
CREATE TABLE IF NOT EXISTS balance (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Acc VARCHAR(10) NOT NULL,
    Credit DECIMAL(10, 2),
    Debit DECIMAL(10, 2),
    Balance DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (Acc) REFERENCES account(Acc)
);

-- Sample data insertion into account table
INSERT INTO account (Acc, Name, DOB, Password, Acc_Type, Nationality, Caste, Gender, Mobile, Landline, Address, Branch, Balance)
VALUES 
('1234567890', 'John Doe', '1980-01-01', 'password123', 'Savings', 'American', 'General', 'M', '1234567890', '0987654321', '123 Main St, Anytown, USA', 'Main Branch', 1000.00),
('1234567891', 'Jane Smith', '1990-02-15', 'password456', 'Checking', 'Canadian', 'General', 'F', '2345678901', NULL, '456 Elm St, Othertown, Canada', 'North Branch', 2500.00),
('1234567892', 'Alice Johnson', '1985-03-20', 'password789', 'Savings', 'British', 'General', 'F', '3456789012', '1231231234', '789 Oak St, Anycity, UK', 'East Branch', 1500.00);

-- Sample data insertion into balance table
INSERT INTO balance (Acc, Credit, Debit, Balance) VALUES ('1234567890', 500.00, NULL, 1500.00);
INSERT INTO balance (Acc, Credit, Debit, Balance) VALUES ('1234567891', NULL, 200.00, 1300.00);
INSERT INTO balance (Acc, Credit, Debit, Balance) VALUES ('1234567892', 1000.00, 300.00, 2200.00);
