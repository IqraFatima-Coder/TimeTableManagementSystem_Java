package edu.uet.course;

public class Course {
    public static String csvFile = "D:\\Courses.csv";
    private int courseID;
    private String courseCode;
    private String courseTitle;
    private String courseDesc;
    private String courseCreditHour;
    private Course coursePrerequistID;

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getCourseCreditHour() {
        return courseCreditHour;
    }

    public void setCourseCreditHour(String courseCreditHour) {
        this.courseCreditHour = courseCreditHour;
    }

    public Course getCoursePrerequistID() {
        return coursePrerequistID;
    }

    public void setCoursePrerequistID(Course coursePrerequistID) {
        this.coursePrerequistID = coursePrerequistID;
    }

    @Override
    public String toString() {
        return courseID + "," + courseCode + "," + courseTitle + "," + courseCreditHour + "," + courseDesc + "," + coursePrerequistID;
    }

    public static Course fromString(String line) {
        String[] parts = line.split(",");
        Course course = new Course();
        course.setCourseID(Integer.parseInt(parts[0]));
        course.setCourseCode(parts[1]);
        course.setCourseTitle(parts[2]);
        course.setCourseCreditHour(parts[3]);
        course.setCourseDesc(parts[4]);
        // Assuming coursePrerequistID is handled separately
        return course;
    }
}