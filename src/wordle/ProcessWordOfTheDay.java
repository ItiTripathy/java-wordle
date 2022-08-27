package wordle;

import java.util.ArrayList;

public class ProcessWordOfTheDay {
	
	private int rowLength;
	private int attemptsRemaining;
	private int attempts;
	private String word;
	ArrayList<String> guesses;
	
	public ProcessWordOfTheDay(String str) {
		word = str;
		rowLength = word.length();
		attempts = 6;
		attemptsRemaining = attempts;
		guesses = new ArrayList<String>();
		//System.out.println(word);
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public ArrayList<String> getGuesses() {
		return guesses;
	}

	public void setGuesses(ArrayList<String> guesses) {
		this.guesses = guesses;
	}

	public int getRowLength() {
		return rowLength;
	}

	public void setRowLength(int rowLength) {
		this.rowLength = rowLength;
	}

	public int getAttemptsRemaining() {
		return attemptsRemaining;
	}

	public void setAttemptsRemaining(int attemptsRemaining) {
		this.attemptsRemaining = attemptsRemaining;
	}
	
	public boolean isGameOver() {
		return attemptsRemaining == 0 || didWin();
	}
	
	public boolean didWin() {
		return guesses.contains(word);
	}
	
	public void guess(String str) {
		if(str.length() == word.length()) {
			guesses.add(str);
			attemptsRemaining--;
		}
	}
}
