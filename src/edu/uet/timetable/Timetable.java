package edu.uet.timetable;

import edu.uet.campus.Room;
import edu.uet.teacher.TeacherCourse;

public class Timetable {
    public static String csvFile = "D:\\Timetable.csv";
    private int timetableID;
    private TeacherCourse teacherCourseID;
    private TimeSlot timeSlotID;
    private Room roomID;

    public int getTimetableID() {
        return timetableID;
    }

    public void setTimetableID(int timetableID) {
        this.timetableID = timetableID;
    }

    public TeacherCourse getTeacherCourseID() {
        return teacherCourseID;
    }

    public void setTeacherCourseID(TeacherCourse teacherCourseID) {
        this.teacherCourseID = teacherCourseID;
    }

    public TimeSlot getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(TimeSlot timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public Room getRoomID() {
        return roomID;
    }

    public void setRoomID(Room roomID) {
        this.roomID = roomID;
    }

    @Override
    public String toString() {
        return timetableID + "," + teacherCourseID.getTeacherCourseID() + "," + timeSlotID.getTimeSlotID() + "," + roomID.getRoomID();
    }

    public static Timetable fromString(String line) {
        String[] parts = line.split(",");
        Timetable timetable = new Timetable();
        timetable.setTimetableID(Integer.parseInt(parts[0]));
        // Assuming TeacherCourse, TimeSlot, and Room are handled separately
        return timetable;
    }

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}