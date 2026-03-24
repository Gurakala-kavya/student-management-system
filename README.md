
## Student Management System
This is a Java-based application that performs CRUD operations on student data using JDBC and PostgreSQL. It allows users to add, update, delete, and view student records efficiently.

## 💻 Technologies Used
- Java
- JDBC
- PostgreSQL

## 📌 Features
- Add, Update, Delete Students
- Fetch student data using filters (age, name, email, blood group)
- Uses PreparedStatement for secure database operations

## 🗄️ Database Schema

Table: student

- id (int, primary key)
- name (varchar)
- email (varchar)
- age (int)
- blood_group (varchar)

## ▶️ How to Run
1. Install PostgreSQL
2. Create database: student
3. Update DB credentials in code
4. Run StudentDriver.java
