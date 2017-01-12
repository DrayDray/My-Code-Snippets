package com.sharon.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

	public static void main(String[] args) {
		try {
			//class file serves us for two purposes:
			// 1- Creating a directory (a folder)
			//creates a logic object in the memory only
			File directory = new File("C:/tmp2");

			// mkdir = Make directory
			//actually creates the library
			directory.mkdir();

			// Creating a file - pouring text into it
			String content = "This is the content to write into file"; 
			//again, only a logical object in the memory
			File file = new File("c:/tmp2/FileExample.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				//actually does it - creates a file
				file.createNewFile();
			}

			// 2- Creating a writer object which will write to the file described in line 21 (File file = new File)
			FileWriter fw = new FileWriter(file.getAbsoluteFile());

			// Creating a buffered writer which will hold bulks of content and will write
			// in bulk to the file (writing in bulk is the opposite of writing char, char... 
			// "BufferedWriter" manages the "FileWriter" (high level manages the low level)
			BufferedWriter bw = new BufferedWriter(fw);

			// Actually writing
			bw.write(content);

			// Releasing resources (the buffer)
			bw.close();

			System.out.println("Done");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
