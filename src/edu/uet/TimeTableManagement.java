package edu.uet;
import java.util.List;

import edu.uet.campus.Room;
import edu.uet.campus.RoomData;
public class TimeTableManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RoomData roomData = new RoomData();
		System.out.println("Find One");
		Room room = roomData.findOne(1);
		System.out.println(room.toString());
		System.out.println("----------------------------------------");
		
		
		System.out.println("Find All");
		List<Room> rooms = roomData.findAll();
		for (int i=0;i<rooms.size();i++) {
			System.out.println(rooms.get(i).toString());
		}
		System.out.println("----------------------------------------");
		
		
		System.out.println("Search");
		rooms = roomData.search("CR-");
		for (int i=0;i<rooms.size();i++) {
			System.out.println(rooms.get(i).toString());
		}
		System.out.println("----------------------------------------");
		
		
		System.out.println("Save");
		room.setRoomName("LR-03");
		room.setRoomFloor(1);
		room.setRoomCapacity(50);
		room.setRoomType("Lab Room");
        roomData.save(room);	
    	System.out.println(room.toString());
        System.out.println("----------------------------------------");
        
        
        
        System.out.println("Find All After Save");
		rooms = roomData.findAll();
		for (int i=0;i<rooms.size();i++) {
			System.out.println(rooms.get(i).toString());
		}
		System.out.println("----------------------------------------");
        
		//edit 1
//		Room room=new Room();
//		room.setRoomID(1);
//		room.setRoomName("CR-01");
//		room.setRoomFloor(0);
//		room.setRoomCapacity(50);
//		room.setRoomType("Class Room");
//	System.out.println(room.toString());	
		
	}

}
