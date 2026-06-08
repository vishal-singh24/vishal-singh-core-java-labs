package com.vishal.lab4.ex3;

public class Item {
	private int id;
	private String title;
	private int numCopies;
	
	public Item(int id, String title, int numCopies) {
		this.id=id;
		this.title=title;
		this.numCopies=numCopies;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getNumCopies() {
		return numCopies;
	}
	
	public void checkIn() {
		numCopies++;
	}
	
	public void checkOut() {
		if(numCopies>0)
			numCopies--;
	}
	
	@Override
	public String toString() {
		return "ID="+id+", Title="+title+", Copies="+numCopies;
	}

}
