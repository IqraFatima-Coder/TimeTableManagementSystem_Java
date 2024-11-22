package edu.uet.campus;

public class Room {
public static String csvFile="D:\\Rooms.csv";
private int roomID;
private String roomName;
private int roomFloor;
private int roomCapacity;
private String roomType;
public int getRoomID() {
	return roomID;
}
public void setRoomID(int roomID) {
	this.roomID = roomID;
}
public String getRoomName() {
	return roomName;
}
public void setRoomName(String roomName) {
	this.roomName = roomName;
}
public int getRoomFloor() {
	return roomFloor;
}
public void setRoomFloor(int roomFloor) {
	this.roomFloor = roomFloor;
}
public int getRoomCapacity() {
	return roomCapacity;
}
public void setRoomCapacity(int roomCapacity) {
	this.roomCapacity = roomCapacity;
}
public String getRoomType() {
	return roomType;
}
public static String getCsvFile() {
	return csvFile;
}
public static void setCsvFile(String csvFile) {
	Room.csvFile = csvFile;
}
public String toString() {
	String str=null;
	str= this.roomID+","+this.roomName+","+this.roomFloor+","+this.roomCapacity+","+this.roomType;
	return str;
	
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}

}
