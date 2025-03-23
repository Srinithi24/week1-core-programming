import java.util.Scanner;
class otp{
	public static boolean check(){
		int[] check = new int[10];
		for(int i = 0; i<10; i++){
			check[i] = (int) (Math.random() * 899999) + 100000;
		}
		for(int i=0; i < check.length; i++){
			for(int j=i+1; j< check.length; j++){
				if(check[i] == check[j]){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int otp = (int) (Math.random() * 899999) + 100000;
		boolean unique = check();
		if(unique){
			System.out.println("No duplicates");
		}
		else{
			System.out.println("Duplicates present");
		}
	}
}