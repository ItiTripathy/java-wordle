# Project: Wordle

## Outline

This project requires us to develop our own version of the famous "Wordle" game using Java and Java CLI. The user inputs their guess words using the Java Console and we display the results on the console as well.

## MVP

-   Recreate a simplified version of the game Wordle to be played in a Java console application
-   The game should be able to randomly select a 5-letter word from the provided word list
-   The user will be able to enter a guess word that is also 5 characters long
-   For each letter, the application will tell the user if that letter is correct, right letter in the wrong position, or wrong letter
-   After the user guesses 6 times incorrectly, the game is over and the user loses
-   If the user guesses the word correctly, the game is over and the user wins
-   In addition you must implement one of the following extensions, or an extension of your own design as approved by a coach

### Extensions

-   Read the word list directly from the file when the application starts
-   Create a history file that keeps track of user wins/losses and how many letters they guessed it in
-   When the game finishes and the secret word is shown, also display the dictionary definition for that word
    -   Hint: Use a free API (https://dictionaryapi.dev/)
-   Generate an output of the word/guesses and copy it to the user's clipboard so they can share it on socials
    -   Bonus: Use emojis

## Setup

-   Install the Eclipse IDE for Java development.

-   GitHub setup for adding the project to the repository : Important Commands :

          git remote add origin https://github.com/ItiTripathy/java-wordle.git
          git add .
          git commit -m "Comment"
          git push origin main

- Java Project Setup:

            File -> New -> Java Project -> "java-wordle"
            Right-click on source -> Add -> New -> package -> "wordle"
            Right-click on wordle -> Add -> New -> class -> "Main" 

## Implementation

- The Main.java file has the Main() method "public static void main()"
- We have a word-list.json file with all the five-lettered words we will be using for this project
- GetARandomWord.java has the logic for fetching a random word as the "WordOfTheDay" from the json file. 
- We need the installation of  "json-simple-1.1.1.jar" and add it to classpath for using the json utilities classes for manipulating the json data directly from within our project.
- We then process the input guess from the user(6 attempts in total) input through using the Scanner from the console, against the random word fetched from the json file.
- We check if any character exists in the word but not in correct position we change the color to yellow.
- If the character exists in the correct position, we change the color to green.
- After 6 attempts, we display either a win or a fail message depending on the results.

## Known issues

- The cursor resets to the first character on the console screen after every input from the user. To be fixed.

## Future goals / changes

- Update the messages to add emojis based on wins and losses.

## Issues/Roadblocks faced

- To read the words from the json file, we need to install "json-simple-1.1.1.jar" and add the jar file to the classpath and then add the follwing imports:                
            - import org.json.simple.JSONArray;
            - import org.json.simple.JSONObject;
            - import org.json.simple.parser.JSONParser;
            - import org.json.simple.parser.ParseException;
    so that we can manipulate the json data directly from within our Java code.

- The ANSI color codes did not work as expected, I had to install "ANSI Escape in Console" extensions from the Eclipse Market place.

## Contribution

- Install the  "json-simple-1.1.1.jar"  from http://www.java2s.com/Code/Jar/j/Downloadjsonsimple111jar.html (Not Secure)

- Install the "ANSI Escape in Console" extensions from the Eclipse Market place.