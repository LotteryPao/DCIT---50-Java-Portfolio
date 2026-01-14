public class TeacherStudentAssignment {
    public static void main(String[] args) {
        //  Courses
        Course c1 = new Course("DCIT 21A", "Introduction to Computing");
        Course c2 = new Course("DCIT 50A", "Object-Oriented Programming");

        // Add-ons for courses
        Course c3= new Course("GNED 04", "Mga Babasahin Hinggil sa Kasaysayan ng Pilipinas");
        Course c4= new Course("MATH 1A", "Analytic Geometry");
        Course c5= new Course("DCIT 24A", "Information Management");
        Course c6= new Course("FITT 3", "Physical Activities Towards Health and Fitness 1");

        //  For teacher with courses
        Course[] ComputerCourses= { c1, c2, c5 };
        Teacher teacher = new Teacher("Mr. Johnroe Camañaque", 28, "Male", "Computer Studies", ComputerCourses);

        // Add-ons for teachers
        Course[] GnedCourses = { c3 };
        Teacher teacher2 = new Teacher("Mrs.Patricia Sabido", 28, "Female", "Social Sciences and Humanities", GnedCourses);

        Course[] MathCourses = { c4 };
        Teacher teacher3 = new Teacher("Mr. Reyjonel Parales", 30, "Male", "Biological and Physical Sciences", MathCourses);

        Course[] PeCourses = { c6 };
        Teacher teacher4 = new Teacher("Mrs. Karen Tilan", 40, "Female", "Physical Education", PeCourses);


        //  For student
        Student student = new Student("Aldous Dimagiba Stark Jr. " + "Agent 6741", 20, "Non-binary", "202469875");


        System.out.println("--- Student Information ---");
        student.displayStudent();

        System.out.println("\n---  Teacher Information ---");
        teacher.displayTeacher();

        System.out.println("\n---  Teacher Information ---");
        teacher2.displayTeacher();

        System.out.println("\n---  Teacher Information ---");
        teacher3.displayTeacher();

        System.out.println("\n---  Teacher Information ---");
        teacher4.displayTeacher();
    }
}