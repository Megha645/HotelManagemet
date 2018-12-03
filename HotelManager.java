package com.hotel.main;

import java.util.ArrayList;
import java.util.List;

import com.hotel.hilton.Hotel;
import com.hotel.hilton.Person;
import com.hotel.hilton.Room;

public class HotelManager {

	private Hotel hotel = new Hotel();
	
	private void addRoom(int capacity) {
		if(hotel.getRooms()==null) {
			hotel.setRooms(new ArrayList<Room>());
		}
		int roomNumber = hotel.getRooms().size() + 1;
		Room room = new Room(roomNumber,capacity);
		hotel.getRooms().add(room);
	}
	
	private void addGuest(Person person,int roomNumber) {
		
	}
	
	private void addGuest(List<Person> persons,int roomNumber) throws Exception {
		if(hotel.getRooms()!=null) {
			List<Room> rooms = hotel.getRooms();
			for(int i=0;i<rooms.size();i++) {
				Room room = rooms.get(i);
				if(room.getRoomNumber() == roomNumber) {
					if(room.isOccupied() || persons.size() > room.getCapacity()) {
						throw new Exception("Room is occupied or exceeds limit.");
					}else {
						room.setOccupied(true);
						room.setGuests(persons);
					}
				}
			}
		}else {
			throw new Exception("No rooms added in hotel.");
		}
	}
	
	
	public static void main(String[] arg) {
		HotelManager hm = new HotelManager();
		hm.addRoom(2);
		hm.addRoom(2);
		hm.addRoom(2);
		hm.addRoom(2);
		
		Person p1=new Person("Divyank",'M');
		Person p2=new Person("Megha",'F');
		Person p3=new Person("abc",'M');
		Person p4=new Person("def",'F');
		Person p5=new Person("ghi",'F');
		Person p6=new Person("jkl",'F');
		Person p7=new Person("mno",'M');
		Person p8=new Person("pqr",'F');
		Person p9=new Person("stu",'M');
		
		List<Person> l1 = new ArrayList<Person>();
		l1.add(p1);
		l1.add(p1);
		try {
			hm.addGuest(l1, 3);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	
	
}
