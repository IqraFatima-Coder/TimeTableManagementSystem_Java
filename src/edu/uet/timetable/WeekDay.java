package edu.uet.timetable;

public class WeekDay {
public static String csvFile="D:\\WeekDays.csv";
private int weekDayID;
private String weekDayName;
public int getWeekDayID() {
	return weekDayID;
}
public void setWeekDayID(int weekDayID) {
	this.weekDayID = weekDayID;
}
public String getWeekDayName() {
	return weekDayName;
}
public void setWeekDayName(String weekDayName) {
	this.weekDayName = weekDayName;
}
public String toString() {
	String str=null;
	str= this.weekDayID+","+this.weekDayName;
	return str;
}
}
