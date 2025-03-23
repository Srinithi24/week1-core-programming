import java.util.Scanner;
class sum{
	static int calc(int number){
		int calculation = 0;
		for(int i =0; i<=number; i++){
			calculation += i;
		}
		return calculation;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int n = (num*(num+1))/2;
		int res = calc(num);
		if(res == n){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not equal");
		}
		
		scan.close();
	}
}