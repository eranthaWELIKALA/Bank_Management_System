# Bank Management System
## Overview
This is a simple Bank Management System application developed using Java Swing for the user interface and MySQL for the database. The application provides functionalities such as user login, sign-up, viewing account balance, transferring funds, changing PIN, and viewing user profile.


## Features
- User Authentication: Login and Signup screens for user authentication.
- Account Management: View account details, balance, and profile information.
- Fund Transfers: Transfer funds between accounts.
- Change PIN: Update the account PIN securely.
- Profile Management: View and update profile information.


## Requirements
- Java Development Kit (JDK)
- NetBeans IDE or any similar IDE that supports Java Swing applications
- MySQL Server


## Getting Started
### Prerequisites
Ensure you have the following software installed:
1. Java Development Kit (JDK): Download JDK
2. NetBeans IDE: Download NetBeans
3. MySQL Server: Download MySQL


### Installation
1. Clone the repository:
```
git clone https://github.com/your-username/bank-management-system.git
cd bank-management-system
```
2. Set up the MySQL database:
- Open your MySQL server.
- Create a new database.
- Run the SQL script db_script.sql located in the database folder to create the necessary tables and insert sample data.
  - Example:
```
CREATE DATABASE bank_db;
USE bank_db;
SOURCE path/to/db_script.sql;
```
3. Update Database Configuration:
- Open DBConnect.java located in the src/com/yourpackage/database directory.
- Update the database URL, username, and password to match your MySQL server configuration.
```
private static final String URL = "jdbc:mysql://localhost:3306/bank_db";
private static final String USER = "your_mysql_username";
private static final String PASSWORD = "your_mysql_password";
```
4. Run the Application:
- Open the project in NetBeans IDE.
- Build and run the project.


## Usage
1. Login:
- Use your credentials to log in to your account.
- If you don't have an account, sign up for a new account.
2. Account Page:
- View your account balance and profile.
- Transfer funds to other accounts.
- Change your account PIN.
- Update your profile information.


## Folder Structure
```
bank-management-system/
│
├── database/
│   └── db_script.sql
│
├── src/
│   ├── bms/
│   │   ├── frame/ 
│   │   ├── panels/
│   │   ├── utils/
│   │   └── images/
│
├── README.md
└── .gitignore
```


## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.


## License
This project is licensed under the MIT License - see the LICENSE file for details.
