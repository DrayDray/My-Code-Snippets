package com.sharon.files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Writing a function that sums up integers from a text file, one int per line.
public class SumIntsFromATextFile {

	public static void main(String[] args) throws IOException {

		//OPTION 1:
		BufferedReader br2 = null;
		int total = 0;
		try {
			br2 = new BufferedReader(new FileReader("C:/Users/Nadav Dray/Documents/tmp/text.txt"));
			StringBuilder sb2 = new StringBuilder();
			for(String line2 = br2.readLine(); line2 != null; line2 = br2.readLine()){
				if(!line2.equals("")){
					total += Integer.parseInt(line2);
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			br2.close();
		}
		System.out.println("Option 1: " + total);

		
		//OPTION 2:
		Scanner in = new Scanner(new FileReader("C:/Users/Nadav Dray/Documents/tmp/text.txt"));
		int sum = 0;
		while (in.hasNext()) { 
			sum = sum + Integer.parseInt(in.next());
		}
		System.out.println("Option 2: " + sum);

		//Just Reading the file and printing it:
		BufferedReader br = null;
		String everything = "";
		try {
			br = new BufferedReader(new FileReader("C:/Users/Nadav Dray/Documents/tmp/text.txt"));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			br.close();
		}
		System.out.println("Entire File: " + everything);
	}
}

/*Sample Output:
Option 1: 20
Option 2: 20
Entire File: 5

10
5
*/


