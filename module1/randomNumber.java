import java.util.Scanner;
class randomNumber{
	public static int guess(){
		return (int)(Math.random() * 100)+1;
		
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int guNum = guess();
		while(true){
			System.out.print("Enter a number between 1- 100: ");
			int num = scan.nextInt();
			if(guNum == num){
			System.out.println("Correct");
			break;
			}else if(guNum > num){
			System.out.println("Guessed num is high");
			}else{
			System.out.println("Guessed num is low");
			}
		}
	scan.close();
	}
}