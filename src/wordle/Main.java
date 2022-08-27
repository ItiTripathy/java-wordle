package wordle;


import java.util.*;


public class Main {
		
	public static void main(String[] args) {
		
		String wordOfTheDay = GetARandomWordClass.GetARandomWord();
		
		ProcessWordOfTheDay word = new ProcessWordOfTheDay(wordOfTheDay);
		
		//System.out.println(wordOfTheDay);
		
		
		Scanner input = new Scanner(System.in);
		
		DisplayWordle display = new DisplayWordle(word, input);
		
		while(!word.isGameOver()) {
			
			display.promptScreen();
			
			display.printWordle();
		}
		
		if(word.didWin()) {
			System.out.println("Congratulations, You guessed the word correctly!");
		} else {
			System.out.println("Sorry, You did not guess the word correctly!");
		}
		
		System.out.println("Word of the day is " + " \"" +word.getWord() + "\" ");
		input.close();
	}
		
}
	
	

