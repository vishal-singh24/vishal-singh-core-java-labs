package com.vishal.lab4.ex3;

public class WrittenItem extends Item {
	private String author;
	
	public WrittenItem(int id, String title, int numCopies, String author) {
		super(id,title,numCopies);
		this.author=author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Author="+author;
	}

}
