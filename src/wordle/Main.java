package wordle;

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
	
	public static Scanner s = new Scanner(System.in);
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_GREEN = "\u001B[32m";
	

	public static void main(String[] args) {
		
		int numberOfTries = 0;
		System.out.println("Please Enter A Five-Lettered Word");
		
		String wordOfTheDay = GetARandomWordClass.GetARandomWord();
		System.out.println(wordOfTheDay);
		
		char[] answer = new char[5];
		char[] input = new char[5];
		boolean done = false;
		
		while(!done) {
			
			numberOfTries++;
			String inputString = s.nextLine().toLowerCase();
			if(inputString.length() > 5 || inputString.length() < 5 || inputString.length() == 0) {
				System.out.println("Invalid Input !! Please Enter Only A Five-Lettered Word!!");
			}
			while(inputString.length() < 5) {
				inputString = s.nextLine().toLowerCase();
			}
			for(int i=0; i<5; i++) {
				answer[i] = wordOfTheDay.charAt(i);
				
				input[i] = inputString.charAt(i);
				
			}
			done = true;
			System.out.println(answer);
			System.out.println(input);
		}		
	}
}
