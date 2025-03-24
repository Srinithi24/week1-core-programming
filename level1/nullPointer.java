import java.util.Scanner;
class nullPointer{
	public static void generateException() {
        String text = null; 
        System.out.println(text.length()); 
    }
	public static void error(){
		String text = null;
		try{
			System.out.print(text.length());
		}
		catch(NullPointerException e){
		System.out.println("NullPointerException found");
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		error();
		scan.close();
	}
}