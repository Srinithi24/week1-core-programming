import java.util.Scanner;
class length{
	public static int manualCase(String text){
		int count = 0;
		try{
			while(true){
			text.charAt(count);
			count++;
			}
		}catch(IndexOutOfBoundsException e){
			
		}
		return count;
	}
	public static boolean compare(int count, int count2){
		return count == count2;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String text = scan.nextLine();
		int manual = manualCase(text);
		int builtIn = text.length();
		boolean same = compare(manual, builtIn);
		System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Same? " + same);
        
        scan.close();
		
	}
}