import java.util.Scanner;
class multiplication{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		for(int i = 6; i <=9 ; i++){
			System.out.println(num +" * "+i+" = "+(num*i));
		}
		scan.close();
	}
}