import java.util.Scanner;

class words {

    // Method to find the length of a string without using built-in length()
    public static int length(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to split the text into words manually without using split()
    public static String[] customSplit(String text) {
        if (text == null || text.isEmpty()) {
            return new String[0]; // Return empty array for empty input
        }

        int spaceCount = 0;
        int textLength = length(text); // Use custom length() method

        // First pass: Count spaces to determine number of words
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndex = new int[spaceCount + 2]; // +2 for -1 (start) and textLength (end)
        int index = 0;
        spaceIndex[index++] = -1; // Imaginary space before first word

        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }
        spaceIndex[index] = textLength; // Mark end of last word

        // Second pass: Extract words using space indexes
        String[] words = new String[spaceCount + 1]; // Number of words = spaceCount + 1
        for (int i = 0; i < words.length; i++) {
            int start = spaceIndex[i] + 1;
            int end = spaceIndex[i + 1];

            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArray(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scan.nextLine(); // Use nextLine() to read full input
        scan.close();

        // Using custom method
        String[] customWords = customSplit(text);
        
        // Using built-in split() method
        String[] builtInWords = text.split(" ");

        // Display results
        System.out.println("\nCustom Split Result:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Compare results
        boolean isSame = compareArray(customWords, builtInWords);
        System.out.println("\nDo both methods give the same result? " + isSame);
    }
}
