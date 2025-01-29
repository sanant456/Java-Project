import java.util.ArrayList;

    public class Student {
        private String studentId;
        private String name;
        private ArrayList<String> registeredCourses;

        public Student(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
            this.registeredCourses = new ArrayList<>();
        }

        public String getStudentId() {
            return studentId;
        }

        public String getName() {
            return name;
        }

        public ArrayList<String> getRegisteredCourses() {
            return registeredCourses;
        }

        public void registerCourse(String courseCode) {
            registeredCourses.add(courseCode);
        }

        public void dropCourse(String courseCode) {
            registeredCourses.remove(courseCode);
        }

        public void displayStudentDetails() {
            System.out.println("Student ID: " + studentId + " | Name: " + name);
            System.out.println("Registered Courses: " + (registeredCourses.isEmpty() ? "None" : registeredCourses));
            System.out.println("-----------------------------------");
        }
    }


