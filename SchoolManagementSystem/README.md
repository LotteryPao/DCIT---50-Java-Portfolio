**Laboratory Activity 5: Modeling a School Management System**


## Overview
This system that I made is designed to model a simple **School Management System**.

The program creates a hierarchy where students and teachers share common attributes but maintain specific roles and data.

##  Key Features
* **Inheritance:** Utilizes the `extends` keyword to allow `Student` and `Teacher` classes to inherit attributes (`name`, `age`, `gender`) from the parent `Person` class.
* **Object Composition:** Implements a "Has-A" relationship where a `Teacher` object contains an array of `Course` objects.
* **Constructor Chaining:** Uses `super()` to call the parent class constructor for efficient memory initialization.
* **Data Display:** Custom methods to print structured information for specific roles.

##  Class Structure

### 1. `Person` (Parent Class)
The base class for all individuals.
* **Attributes:** `name`, `age`, `gender`
* **Methods:** `displayInfo()`

### 2. `Student` (Subclass of Person)
Represents a student in the school.
* **Attributes:** `studentId`
* **Methods:** `displayStudent()` (Displays personal info + Student ID)

### 3. `Teacher` (Subclass of Person)
Represents a faculty member.
* **Attributes:** `department`, `Course[]` (Array of assigned courses)
* **Methods:** `displayTeacher()` (Displays personal info + Department + List of Courses)

### 4. `Course`
Represents a subject being taught.
* **Attributes:** `courseCode`, `courseName`
* **Methods:** `displayCourse()`

### 5. `TeacherStudentAssignment` (Main Class)
The entry point of the program. It instantiates objects, assigns courses to teachers, and prints the final output to the console.


