import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Student Grade Calculator!");

        // Collect student details
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        // Collect marks for 5 subjects
        double[] marks = new double[5];
        double totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter marks for Subject %d: ", i + 1);
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        // Calculate percentage and grade
        double percentage = totalMarks / 5;
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the result
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

