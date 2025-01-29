public class Main {
    public static void main(String[] args) {
        CourseDatabase courseDatabase = new CourseDatabase();
        StudentDatabase studentDatabase = new StudentDatabase();
        studentDatabase.addStudent(new Student("S101", "Alice"));
        studentDatabase.addStudent(new Student("S102", "Bob"));
        studentDatabase.addStudent(new Student("S103", "Aryan" ));
        studentDatabase.addStudent(new Student("S104", "Sumit"));
        studentDatabase.addStudent(new Student("S105", "Harsh"));
        studentDatabase.addStudent(new Student("S106", "Piyush" ));
        RegistrationSystem system = new RegistrationSystem(courseDatabase, studentDatabase);
        system.start();
    }
}

