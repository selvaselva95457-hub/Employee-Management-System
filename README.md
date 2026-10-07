Employee Management System

A simple Java-based Employee Management System developed to practice and demonstrate core Object-Oriented Programming (OOP) concepts.

📌 Project Overview

This project allows users to manage employees through a console-based menu.

The system supports:

- Add Employee
- View Employees
- Search Employee
- Delete Employee
- Update Employee Salary
- Exit

The project also demonstrates Inheritance, Encapsulation, Method Overriding, Runtime Polymorphism, Constructors, ArrayList, Loops, and Switch Statements.

🛠️ Technologies Used

- Java
- OOP
- ArrayList
- Scanner
- IntelliJ IDEA

📂 Project Structure

EmployeeManagementSystem
│
├── Employee.java
├── Developer.java
├── Manager.java
└── Main.java

🧩 OOP Concepts Used

1. Encapsulation

Employee details such as ID, name, and salary are declared as "private".

private int id;
private String name;
private double salary;

Getters and setters are used to access and modify the data.

2. Inheritance

"Developer" and "Manager" inherit from the "Employee" class.

public class Developer extends Employee

public class Manager extends Employee

3. Constructor

Constructors are used to initialize employee objects.

Employee(int id, String name, double salary)

4. Method Overriding

"Developer" and "Manager" override the "displayDetails()" method.

@Override
public void displayDetails()

5. Runtime Polymorphism

Parent class reference is used to store child class objects.

Employee e1 = new Developer(101, "Santhosh", 30000, "Java");

Employee e2 = new Manager(102, "Rahul", 40000, 5);

6. ArrayList

Employees are stored dynamically using:

ArrayList<Employee> employees = new ArrayList<>();

⚙️ Features

Add Employee

Users can add either:

- Developer
- Manager

Developer information includes programming language.

Manager information includes team size.

View Employees

Displays all employees using a for-each loop.

Search Employee

Searches for an employee using their ID.

Delete Employee

Deletes an employee from the "ArrayList" using their ID.

Update Salary

Updates an employee's salary using the setter method.

Basic salary validation is also included.

▶️ How to Run

1. Clone or download the project.
2. Open the project in IntelliJ IDEA.
3. Make sure Java is installed.
4. Open "Main.java".
5. Run the "main()" method.
6. Select an option from the menu.

💻 Sample Menu

===== Employee Management System =====

1. Add Employee
2. View Employees
3. Search Employee
4. Delete Employee
5. Update Salary
6. Exit

Enter your choice:

🎯 Learning Objective

The main purpose of this project is to gain practical experience with Java OOP concepts and understand how these concepts are combined to build a small real-world application.

👨‍💻 Author

Santhosh N

Java Developer / Software Trainee Aspirant
