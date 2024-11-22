package edu.uet.teacher;

import edu.uet.person.Person;

public class Teacher extends Person {
    public static String csvFile = "D:\\Teachers.csv";
    private int teacherID;

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return teacherID + "," + getForeName() + "," + getSurName(); // Include other fields if necessary
    }

    public static Teacher fromString(String line) {
        String[] parts = line.split(",");
        Teacher teacher = new Teacher();
        teacher.setTeacherID(Integer.parseInt(parts[0]));
        teacher.setForeName(parts[1]);
        teacher.setSurName(parts[2]);
        // Set other fields if necessary
        return teacher;
    }
}