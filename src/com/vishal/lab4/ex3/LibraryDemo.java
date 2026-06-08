package com.vishal.lab4.ex3;

public class LibraryDemo {
	public static void main(String[] args) {
		Book book=new Book(101,"Java Programming",5,"James Gosling");
		
		JournalPaper journal=new JournalPaper(102,"AI Research",3, "John Smith",2025);
		
		Video video=new Video(103,"Inception",4,148,"Christopher Nolan","Sci-Fi",2010);
		
		CD cd=new CD(104,"Greatest Hits",2,60,"Arijit Sing","Music");
		System.out.println("BOOK");
		System.out.println(book);
		System.out.println("\nJOURNAL");
		System.out.println(journal);
		System.out.println("\nVIDEO");
		System.out.println(video);
		System.out.println("\nCD");
		System.out.println(cd);
		
		book.checkOut();
		System.out.println("\nAfter Book Checkout: ");
		System.out.println(book);
				
	}

}
