import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int[] frequency = new int[10];
        int temp = number; 
        while (temp > 0) {
            int lastDigit = temp % 10; 
            frequency[lastDigit] = frequency[lastDigit] + 1;
            temp = temp / 10; 
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " : " + frequency[i] );
            }
        }
        scan.close();
    }
}
