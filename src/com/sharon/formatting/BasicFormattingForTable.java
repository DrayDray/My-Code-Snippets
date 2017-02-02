package com.sharon.formatting;

public class BasicFormattingForTable {

	public static void main(String[] arguments){
		
		System.out.println("six 'spots'");
		for (int i = 46; i < 50; i++) {
			for (int j = 0; j < 10; j++) {
				//%3d means each print out of an integer will take up 3 single spaces
				//%4d means each print out of an integer will take up 4 single spaces
				System.out.printf("%6d", j*13*i);
			}
			System.out.println();
		}
		System.out.println("\n ---------------------------------------------------");
		System.out.println("six 'spots' and thousand commas");
		for (int i = 45; i < 50; i++) {
			for (int j = 0; j < 10; j++) {
				//adding the , adds formatting for thousands
				System.out.printf("%,6d", j*13*i);
			}
			System.out.println();
		}
		System.out.println("\n ---------------------------------------------------");

	}

}
