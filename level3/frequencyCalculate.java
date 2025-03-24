import java.util.Scanner;

class frequencyCalculate {
    
    public static char[][] findCharacterFrequency(String str) {
        int[] freq = new int[256]; 

        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        
        char[][] result = new char[uniqueCount][2];
        int index = 0;

        
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = (char) i;
                result[index][1] = (char) (freq[i] + '0'); 
                index++;
            }
        }
        return result;
    }

  
    public static void displayFrequency(char[][] charFreq) {
        System.out.println("Character\tFrequency");
        for (char[] chars : charFreq) {
            System.out.println(chars[0] + "\t\t" + (chars[1] - '0')); 
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scan.nextLine();

        char[][] result = findCharacterFrequency(text);
        displayFrequency(result);

        scan.close(); 
    }
}
