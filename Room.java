package com.hotel.hilton;

import java.util.Date;
import java.util.List;

public class Room {

	private int capacity;
	private int roomNumber;
	private List<Person> guests;
	private int perNight;
	private Date dateOfCheckIn;
	private boolean occupied;
	
	public Room(int roomNumber,int capacity) {
		this.roomNumber=roomNumber;
		this.capacity=capacity;
		System.out.println("Room number "+roomNumber+" is created.");
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<Person> getGuests() {
		return guests;
	}

	public void setGuests(List<Person> guests) {
		this.guests = guests;
		System.out.println("this room is assigned room number:  "+this.roomNumber);
	}

	public int getPerNight() {
		return perNight;
	}

	public void setPerNight(int perNight) {
		this.perNight = perNight;
	}

	public Date getDateOfCheckIn() {
		return dateOfCheckIn;
	}

	public void setDateOfCheckIn(Date dateOfCheckIn) {
		this.dateOfCheckIn = dateOfCheckIn;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	
}
