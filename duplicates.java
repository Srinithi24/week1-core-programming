import java.util.Scanner;

class duplicates{
    public static String removeDuplicateChars(String text) {
        boolean[] seen = new boolean[256]; 
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!seen[ch]) { 
                result.append(ch);
                seen[ch] = true;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String output = removeDuplicateChars(input);
        System.out.println("New string : " + output);
        
        scanner.close();
    }
}
