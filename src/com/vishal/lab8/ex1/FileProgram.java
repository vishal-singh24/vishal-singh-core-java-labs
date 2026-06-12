package com.vishal.lab8.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {
	public static void main(String[] args) {
		String sourcePath = "source.txt";
		String targetPath = "target.txt";

		File sourceFile = new File(sourcePath);
		if (!sourceFile.exists()) {
			try (FileWriter writer = new FileWriter(sourceFile)) {
				writer.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ123456");
				System.out.println("Created a sample source.txt file with 32 characters.");

			} catch (IOException e) {
				System.err.println("Could not create sample file: " + e.getMessage());
				return;
			}
		}

		try {
			FileInputStream fis = new FileInputStream(sourcePath);
			FileOutputStream fos = new FileOutputStream(targetPath);

			CopyDataThread copyThread = new CopyDataThread(fis, fos);
			System.out.println("Starting file copy operation via background thread...");
			copyThread.start();

		} catch (IOException e) {
			System.err.println("Initialization Error: " + e.getMessage());
		}
	}
}