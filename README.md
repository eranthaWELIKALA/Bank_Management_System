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
git clone https://github.com/eranthaWELIKALA/Bank_Management_System.git
cd bank-management-system
```
2. Set up the MySQL database:
- Open your MySQL server.
- Create a new database.
- Run the SQL script db_script.sql located in the database folder to create the necessary tables and insert sample data.
  - Example:
```
CREATE DATABASE bms;
USE bms;
SOURCE path/to/db.sql;
```
3. Update Database Configuration:
- Open DBConnect.java located in the src/com/yourpackage/database directory.
- Update the database URL, username, and password to match your MySQL server configuration.
```
public DBConnect() throws ClassNotFoundException{
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","12345678");
        st = connect.createStatement();
        }
    catch(SQLException ex){
        System.out.println(ex);
    }
}
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

## Screenshots

![Bank Management System - Login](https://github.com/eranthaWELIKALA/Bank_Management_System/assets/33684206/abf2738b-d223-4a0c-bed4-11bc15251cd1)
![Bank Management System - Signup](https://github.com/eranthaWELIKALA/Bank_Management_System/assets/33684206/43b28c21-2b37-49aa-afd1-8543793c12d5)
![Bank Management System - Loading](https://github.com/eranthaWELIKALA/Bank_Management_System/assets/33684206/f675f491-ad8f-4966-a346-68fe83f7d0f1)
![Bank Management System - Account](https://github.com/eranthaWELIKALA/Bank_Management_System/assets/33684206/e632d2c8-523f-4d62-8500-fe29a9f6ea78)
![Bank Management System - Account - ViewBalance](https://github.com/eranthaWELIKALA/Bank_Management_System/assets/33684206/0bcda77b-3604-442a-8898-91325b61a6b8)
![Bank Management System - Account - Transfer](https://github.com/eranthaWELIKALA/Bank_Management_System/assets/33684206/d85a7e9e-6426-48ab-abfc-4fd0a2c10c7e)
![Bank Management System - Account - ChangePin](https://github.com/eranthaWELIKALA/Bank_Management_System/assets/33684206/5b0017c5-5f65-4ea0-b425-610ba381030f)


## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.


## License
This project is licensed under the MIT License - see the LICENSE file for details.
