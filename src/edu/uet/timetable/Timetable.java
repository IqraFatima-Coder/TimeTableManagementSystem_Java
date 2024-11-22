package edu.uet.timetable;

import edu.uet.campus.Room;
import edu.uet.teacher.TeacherCourse;

public class Timetable {
	public static String csvFile="D:\\Timetable.csv";
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
public String toString() {
	String str=null;
	str= this.timetableID+","+this.teacherCourseID.getTeacherCourseID()+","+this.timeSlotID.getTimeSlotID()+","+this.roomID.getRoomID();
	return str;
}
}
