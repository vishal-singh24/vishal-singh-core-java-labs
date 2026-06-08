package com.vishal.lab4.ex3;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	
	public CD(int id, String title, int numCopies, int runtime, String genre, String artist) {
		super(id,title,numCopies,runtime);
		this.artist=artist;
		this.genre=genre;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Artist="+artist+", Genre="+genre;
	}

}
