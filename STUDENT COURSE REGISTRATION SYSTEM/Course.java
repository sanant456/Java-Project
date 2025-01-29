import java.util.ArrayList;
public class Course {
        private String courseCode;
        private String title;
        private String description;
        private int capacity;
        private String schedule;
        private ArrayList<String> enrolledStudents;

        public Course(String courseCode, String title, String description, int capacity, String schedule) {
            this.courseCode = courseCode;
            this.title = title;
            this.description = description;
            this.capacity = capacity;
            this.schedule = schedule;
            this.enrolledStudents = new ArrayList<>();
        }

        public String getCourseCode() {
            return courseCode;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public int getCapacity() {
            return capacity;
        }

        public String getSchedule() {
            return schedule;
        }

        public int getAvailableSlots() {
            return capacity - enrolledStudents.size();
        }

        public boolean enrollStudent(String studentId) {
            if (enrolledStudents.size() < capacity) {
                enrolledStudents.add(studentId);
                return true;
            }
            return false;
        }

        public boolean removeStudent(String studentId) {
            return enrolledStudents.remove(studentId);
        }

        public boolean isStudentEnrolled(String studentId) {
            return enrolledStudents.contains(studentId);
        }

        public void displayCourseDetails() {
            System.out.println(courseCode + " - " + title + " | Slots: " + getAvailableSlots() + "/" + capacity);
            System.out.println("Schedule: " + schedule);
            System.out.println("Description: " + description);
            System.out.println("-----------------------------------");
        }
    }

