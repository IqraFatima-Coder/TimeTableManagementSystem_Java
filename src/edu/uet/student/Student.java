package edu.uet.student;

import edu.uet.person.Person;

public class Student extends Person{
public static String csvFile="D:\\Students.csv";
private String studentID;
private String studentRollNo;
private String studyProgram;
private String studyYear;
public String getStudentID() {
	return studentID;
}
public void setStudentID(String studentID) {
	this.studentID = studentID;
}
public String getStudentRollNo() {
	return studentRollNo;
}
public void setStudentRollNo(String studentRollNo) {
	this.studentRollNo = studentRollNo;
}
public String getStudyProgram() {
	return studyProgram;
}
public void setStudyProgram(String studyProgram) {
	this.studyProgram = studyProgram;
}
public String getStudyYear() {
	return studyYear;
}
public void setStudyYear(String studyYear) {
	this.studyYear = studyYear;
}
public String toString() {
	String str=null;
	str= this.studentID+","+this.studentRollNo+","+this.studyProgram+","+this.studyYear;
	return str;
	
}
public void setStudentEmail(String studentEmail) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setStudentEmail'");
}
}
