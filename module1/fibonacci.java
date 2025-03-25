import java.util.Scanner;
class fibonacci{
	public static int[] fibonacciSeq(int num){
		int[] seq = new int[num];
		int a=0; 
		int b=1;
		for(int i =0; i<num; i++){
			seq[i] = a;
			int c = a + b;
			a = b;
			b = c;
		}
		return seq;
	}
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int[] res = fibonacciSeq(num);
		for(int i=0; i<res.length; i++){
			System.out.print(res[i] + " ");
		}
	}
}