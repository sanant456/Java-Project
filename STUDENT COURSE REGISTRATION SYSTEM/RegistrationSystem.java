import java.util.Scanner;

public class RegistrationSystem {
    private CourseDatabase courseDatabase;
    private StudentDatabase studentDatabase;
    private Scanner scanner;

    public RegistrationSystem(CourseDatabase courseDatabase, StudentDatabase studentDatabase) {
        this.courseDatabase = courseDatabase;
        this.studentDatabase = studentDatabase;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n==== STUDENT COURSE REGISTRATION ====");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. Drop a Course");
            System.out.println("4. View Student Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    courseDatabase.displayAllCourses();
                    break;
                case 2:
                    registerCourse();
                    break;
                case 3:
                    dropCourse();
                    break;
                case 4:
                    viewStudentDetails();
                    break;
                case 5:
                    System.out.println("Thank you for using the system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void registerCourse() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        Student student = studentDatabase.getStudent(studentId);

        if (student == null) {
            System.out.println("Student not found. Please register first.");
            return;
        }

        System.out.print("Enter Course Code to Register: ");
        String courseCode = scanner.nextLine();
        Course course = courseDatabase.getCourse(courseCode);

        if (course == null) {
            System.out.println("Invalid course code.");
            return;
        }

        if (course.enrollStudent(studentId)) {
            student.registerCourse(courseCode);
            System.out.println("Registration successful!");
        } else {
            System.out.println("Course is full!");
        }
    }

    private void dropCourse() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        Student student = studentDatabase.getStudent(studentId);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter Course Code to Drop: ");
        String courseCode = scanner.nextLine();
        Course course = courseDatabase.getCourse(courseCode);

        if (course == null || !course.isStudentEnrolled(studentId)) {
            System.out.println("You are not enrolled in this course.");
            return;
        }

        student.dropCourse(courseCode);
        course.removeStudent(studentId);
        System.out.println("Course dropped successfully.");
    }

    private void viewStudentDetails() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        Student student = studentDatabase.getStudent(studentId);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            student.displayStudentDetails();
        }
    }
}
