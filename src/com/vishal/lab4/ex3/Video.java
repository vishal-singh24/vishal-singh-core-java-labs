package com.vishal.lab4.ex3;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int yearReleased;
	
	public Video(int id, String title, int numCopies, int runtime, String director, String genre, int yearReleased) {
		super(id,title,numCopies, runtime);
		this.director=director;
		this.genre=genre;
		this.yearReleased=yearReleased;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Direcotr="+director+", Genre="+genre+", Year Released="+yearReleased;
	}

}
