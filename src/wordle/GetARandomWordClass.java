package wordle;


import java.util.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetARandomWordClass {
	
	public static String GetARandomWord() {
		
		JSONParser parser = new JSONParser();
	    String randomWord = null;
		
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
			randomWord = jsonArray.get(num1).toString();
			//System.out.println(randomWord);
			
			//return randomWord;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return randomWord;
	}

}
