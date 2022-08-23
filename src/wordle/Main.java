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

	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("C:\\nology\\java-wordle\\src\\wordle\\word-list.json"));
			JSONObject jsonObject = (JSONObject)obj;
			JSONArray jsonArray = (JSONArray) jsonObject.get("words");
			
			//Iterator iterator = jsonArray.iterator();
	        
			/*
			 * while (iterator.hasNext()) { System.out.println(iterator.next()); }
			 */
			
			Random r = new Random();
			int num1 = r.nextInt(jsonArray.size());
			String randomWord = jsonArray.get(num1).toString();
			System.out.println(randomWord);
			
	         
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
