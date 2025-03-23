import java.util.Scanner;
class simpleInterest {
	public static double calculateSimpleInterest(int principal, int rate, int time){
		double simpleInterest = (principal * rate * time)/100.0;
		return simpleInterest;
	}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a principal: ");
        int principal = scan.nextInt();
		System.out.print("Enter a rate: ");
        int rate = scan.nextInt();
		System.out.print("Enter a time: ");
        int time = scan.nextInt();
		double res = calculateSimpleInterest(principal, rate, time);
		System.out.println("The Simple Interest is "+res+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
        scan.close();
    }
}
