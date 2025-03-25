import java.util.Scanner;
class longest{
    public static String findLongestWord(String text) {
        String[] words = text.split("\\s+"); 
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scan.nextLine();
        String longestWord = findLongestWord(text);
        System.out.println("Longest word: " + longestWord);
        scan.close();
    }
}
