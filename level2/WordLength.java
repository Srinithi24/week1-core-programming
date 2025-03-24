import java.util.Scanner;

public class WordLength{
    
    
    public static String[] splitWords(String text) {
        int n = text.length(); 
        String[] words = new String[n];  
        int wordCount = 0;  // Track the number of words
        String currentWord = "";  // Temporary storage for each word
        
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);  // Get each character
            
            if (ch != ' ') {  // If it's not a space, add it to the current word
                currentWord += ch;
            } else if (!currentWord.equals("")) {  // If space is found, save the word
                words[wordCount++] = currentWord;
                currentWord = "";  // Reset for the next word
            }
        }
        
        if (!currentWord.equals("")) {  // Add the last word if any
            words[wordCount++] = currentWord;
        }
        
        String[] finalWords = new String[wordCount];  // Create final array with correct size
        System.arraycopy(words, 0, finalWords, 0, wordCount);
        
        return finalWords;
    }

    // Method to find the length of a string without using length()
    public static int findLength(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {  // Loop through each character
            count++;
        }
        return count;
    }

    // Method to return a 2D String array with words and their lengths
    public static String[][] wordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];  // Create 2D array

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];  // Store word
            result[i][1] = String.valueOf(findLength(words[i]));  // Store length as String
        }

        return result;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();  // Get input from user

        String[] words = splitWords(text);  // Get words
        String[][] wordLengthArray = wordLengthArray(words);  // Get 2D array

        // Display result in tabular format
        System.out.println("\nWord\tLength");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }

        scanner.close();
    }
}
