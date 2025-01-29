import java.util.HashMap;

public class CourseDatabase {
    private HashMap<String, Course> courses;

    public CourseDatabase() {
        courses = new HashMap<>();
        addDefaultCourses();
    }

    private void addDefaultCourses() {
        addCourse(new Course("CS101", "Intro to Programming", "Learn basic programming concepts", 30, "Mon/Wed 10AM-12PM"));
        addCourse(new Course("MATH201", "Calculus I", "Basic calculus and derivatives", 25, "Tue/Thu 2PM-4PM"));
        addCourse(new Course("PHY105", "Physics Basics", "Fundamentals of physics", 20, "Mon/Wed 1PM-3PM"));
        addCourse(new Course("ENG167", "English ", "Learn basic concepts tips to solve english comprehension", 25, "Mon/Wed 9AM-12PM"));
        addCourse(new Course("COA205", "Computer Organization and Architecture", "Memory Organization", 25, "Tue/Thu 4PM-5PM"));
        addCourse(new Course("DBMS405", "Database Management System", "Intro into SQL", 25, "Fri/Sat 4PM-6PM"));


    }

    public void addCourse(Course course) {
        courses.put(course.getCourseCode(), course);
    }

    public Course getCourse(String courseCode) {
        return courses.get(courseCode);
    }

    public void displayAllCourses() {
        for (Course course : courses.values()) {
            course.displayCourseDetails();
        }
    }
}

