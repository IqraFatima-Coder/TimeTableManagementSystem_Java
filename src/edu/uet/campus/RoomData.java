package edu.uet.campus;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class RoomData {

@SuppressWarnings("resource")
public List<Room> findAll() {
	List<Room> rooms =new  ArrayList<Room>();
	String line;
	try {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(Room.csvFile));
		while((line=bufferedReader.readLine())!=null) {
			Room room = new Room();
			String[] roomRow=line.split(",");
			room.setRoomID(Integer.parseInt(roomRow[0]));
			room.setRoomName(roomRow[1]);
			room.setRoomFloor(Integer.parseInt(roomRow[2]));
			room.setRoomCapacity(Integer.parseInt(roomRow[3]));
			room.setRoomType(roomRow[4]);
			rooms.add(room);
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rooms;
}
@SuppressWarnings("resource")
public Room findOne(int roomID) {
	String line;
	try {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(Room.csvFile));
		while((line=bufferedReader.readLine())!=null) {
			Room room = new Room();
			String[] roomRow=line.split(",");
			if(Integer.parseInt(roomRow[0])==roomID) {
				room.setRoomID(Integer.parseInt(roomRow[0]));
				room.setRoomName(roomRow[1]);
				room.setRoomFloor(Integer.parseInt(roomRow[2]));
				room.setRoomCapacity(Integer.parseInt(roomRow[3]));
				room.setRoomType(roomRow[4]);
				return room;
			}	
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}

@SuppressWarnings("resource")
public List<Room>  search(String search) {
	List<Room> rooms =new  ArrayList<Room>();
	String line;
	try {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(Room.csvFile));
		while((line=bufferedReader.readLine())!=null) {
			Room room = new Room();
			String[] roomRow=line.split(",");
			if(roomRow[1].contains(search) == true) {
				room.setRoomID(Integer.parseInt(roomRow[0]));
				room.setRoomName(roomRow[1]);
				room.setRoomFloor(Integer.parseInt(roomRow[2]));
				room.setRoomCapacity(Integer.parseInt(roomRow[3]));
				room.setRoomType(roomRow[4]);
				rooms.add(room);
			}	
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rooms;
}

@SuppressWarnings("resource")
public Room save(Room room) {
	FileWriter fileWriter;
	List<Room> rooms = this.findAll();
	
	try {
		fileWriter =new FileWriter(Room.csvFile);
		
		for (int i=0;i<rooms.size();i++) {
			fileWriter.append(rooms.get(i).toString());
			fileWriter.append("\n");
		}
		if(rooms.size()>0) {
			room.setRoomID(rooms.get(rooms.size()-1).getRoomID()+1);
		}else {
			room.setRoomID(1);
		}
		fileWriter.append(room.toString());
		fileWriter.append("\n");
		fileWriter.flush();
		fileWriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return room;
}

}
