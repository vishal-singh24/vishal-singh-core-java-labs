package com.vishal.lab4.ex3;

public class JournalPaper extends WrittenItem {
	private int yearPublished;
	
	public JournalPaper(int id, String title, int numCopies, String author, int yearPublished) {
		super(id,title,numCopies,author);
		this.yearPublished=yearPublished;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Year Published="+ yearPublished;
	}

}
