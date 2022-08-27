package wordle;

import java.util.Scanner;

public class DisplayWordle {
	
	ProcessWordOfTheDay word;
	Scanner input;
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_GREEN = "\u001B[32m";
	
	public DisplayWordle(ProcessWordOfTheDay word, Scanner input) {
		this.word = word;
		this.input = input;
	}
	
	public String promptScreen() {
		while(true) {
			System.out.println("Please Enter A Five-Lettered Word");
			String inputString = input.nextLine().toLowerCase();
			if(inputString.length() != word.getWord().length()) {
				System.out.println("Invalid Input !! Please Enter Only A Five-Lettered Word!!");
			} else {
				word.guess(inputString);
				//System.out.println(inputString);
				return inputString;
			}
		}
	}
	
	public void printWordle() {
		StringBuilder b = new StringBuilder();
		for(String s : word.guesses) {
			for(int i=0; i<s.length(); i++) {
				String answer = word.getWord();
				char c = s.charAt(i);
				
				if (answer.charAt(i) == c) {
					b.append(ANSI_GREEN + c + ANSI_RESET);
				} else if (answer.contains(Character.toString(c))) {
					b.append(ANSI_YELLOW + c + ANSI_RESET);
				} else {
					b.append(c);
				}
				b.append("|");
			}
			b.setLength(b.length() - 1);
			System.out.println(b.toString());
			b = new StringBuilder();
		}
		
		StringBuilder b1 = new StringBuilder();
		for (int i=0; i<word.getAttemptsRemaining(); i++) {
			
			  for(int j=0; j<word.getWord().length(); j++) { 
				  
				  b1.append("_|"); 
			}
			 
			b1.setLength(b1.length() - 1);
			System.out.println(b1.toString());
			b1 = new StringBuilder();
		}
			
	}
}
