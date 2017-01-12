package com.sharon.files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFileExample {

	public static void main(String[] args) throws IOException {
		// Creating a file reference, which points to our mock file
		File file = new File("C:/tmp/Example.txt");
		
		// Getting an input stream which is dedicated to file reading
		InputStream in = new FileInputStream(file);	
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		//another option is to use FileReader instead of InputStreamReader
		//BufferedReader br = new BufferedReader(new FileReader("C:/Users/Nadav Dray/Documents/tmp/text.txt"));

		StringBuilder out = new StringBuilder();
		//String out = "";
		
		String line = reader.readLine();
		while (line != null) {
			out.append(line).append("\n");
			//out = out + line + "\n";
			line = reader.readLine();
		}
		System.out.println(out.toString());   //Prints the string content read from input stream
		reader.close();
	}

}
