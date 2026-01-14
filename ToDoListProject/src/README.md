DCIT 50: FINAL LABORATORY EXAM

Project: A Simple Student TO-D0 List Application 

## Overview
A Java Swing application. My task for this is to solve the problem of disorganized school tasks by building a digital To-Do List.

It allows users to add tasks, view them in a table, and track their status (Not Started, Ongoing, Completed). The project follows the MVC (Model-View-Controller) pattern to keep the code organized.

## Features
* **View Tasks:** Displays all tasks in a `JTable` with columns for ID, Name, Description, and Status.
* **Add New Tasks:** Opens a separate form window to input task details.
* **Status Tracking:** Tasks can be marked as "Not Started", "Ongoing", or "Completed".
* **Validation:** Prevents saving empty tasks.
* **OOP Implementation:** Uses Inheritance, Abstraction, and Encapsulation.

## OOP Concepts Used
I applied several core OOP concepts in this project:
1.  **Abstraction:** Created an `AbstractTask` parent class to define the blueprint for all tasks.
2.  **Inheritance:** The `Task` and `TimedTask` classes inherit attributes and methods from `AbstractTask`.
3.  **Encapsulation:** All attributes are `private` or `protected` and accessed via public getters and setters.
4.  **Polymorphism:** Overriding the `getStatus()` method in the child classes.

## Project Structure
I organized the code into packages to separate concerns:

* **`model`**: Contains the data blueprint (`AbstractTask`, `Task`, `TimedTask`).
* **`controller`**: Contains the logic (`TaskManager`) that handles the list of tasks.
* **`ui`**: Contains the GUI components (`MainFrame`, `TaskForm`).
* **`src/Main.java`**: The entry point of the program.

## How to Run (VS Code)
1.  Open the `ToDoListProject` folder in VS Code.
2.  Make sure the folder structure is correct (source files inside `src`).
3.  Open `src/Main.java`.
4.  Click the **Run** button (Play icon) at the top right, or run this command in the terminal:

```bash
cd src
javac Main.java
java Main
