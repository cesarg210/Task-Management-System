# Task Management Console App
## Overview
This is a simple Java console application for managing tasks, built as part of a self-study plan to prepare for Spring 2026 courses at UT Dallas. The app allows users to add, remove, and view tasks using an ArrayList, demonstrating object-oriented programming and basic data structure concepts. It serves as the initial prototype for a full-stack task management web app (to be developed with Spring Boot, React, and PostgreSQL).
Features

Add Task: Create a new task with an auto-generated ID and user-provided description.
Remove Task: Delete a task by its ID.
View Tasks: Display all tasks or a message if none exist.
Error Handling: Validates user input (e.g., numeric menu choices, valid task IDs).

## Technologies
Java: Core programming language, using OOP principles (classes, encapsulation).
ArrayList: Dynamic array from Java Collections Framework for task storage.

## Installation and Setup

Prerequisites: Java JDK 8 or higher installed.
Clone the Repository:git clone <repository-url>
cd <repository-folder>


Compile and Run:javac TaskApp.java
java TaskApp


Follow the console menu to interact (e.g., choose 1 to add a task).

Usage

Run the program to access a text-based menu.
Options:
1. Add Task: Enter a task description.
2. Remove Task: Enter the task ID to delete.
3. View Tasks: See all tasks.
4. Exit: Close the app.


Example:Task Management App
1. Add Task
2. Remove Task
3. View Tasks
4. Exit
Choose an option: 1
Enter task description: Finish Java homework
Task added successfully!



## Relevance to Coursework

Computer Science II: Applies OOP (Task class, encapsulation), Java collections (ArrayList), and console I/O (Scanner).
Data Structures: Introduces dynamic arrays via ArrayList, a foundation for studying linked lists, stacks, and queues.
Future Work: This app will evolve into a full-stack web application with a Spring Boot backend, React frontend, and PostgreSQL database, incorporating advanced data structures (e.g., priority queues), UNIX deployment, and statistical analytics.

Project Status
This is the initial commit (Week 1 of self-study plan, August 2025). Future updates will include:

Conversion to a REST API using Spring Boot.
Integration with a database and frontend.
Deployment on a UNIX-like environment.

Contact
For questions or feedback, reach out via GitHub issues or cesarg210@gmail.com.
