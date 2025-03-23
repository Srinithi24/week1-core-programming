import java.util.Scanner;
class possibleHandshakes {
	public static int calculateHanshakes(int handshakes){
		return handshakes;
	}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int students = scan.nextInt();
		int handshakes = students * (students-1)/2;
		int res = calculateHanshakes(handshakes);
		System.out.println("Number of handshakes: "+res);
        scan.close();
    }
}
