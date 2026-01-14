// File: TeacherStudentAssignment.java

class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}


class Student extends Person {
    String studentId;

    public Student(String name, int age, String gender, String studentId) {
        super(name, age, gender); // calls parent constructor
        this.studentId = studentId;
    }

    public void displayStudent() {
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}


class Course {
    String courseCode;
    String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
    }
}


class Teacher extends Person {
    String department;
    Course[] courses;

    public Teacher(String name, int age, String gender, String department, Course[] courses) {
        super(name, age, gender);
        this.department = department;
        this.courses = courses;
    }

    public void displayTeacher() {
        displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Courses: ");
        for (Course c : courses) {
            c.displayCourse();
            System.out.println();
        }
    }
}