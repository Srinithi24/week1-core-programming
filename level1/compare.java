import java.util.Scanner;
class compare{
	public static boolean comp(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}else{
			for(int i =0; i<s1.length(); i++){
				if(s1.charAt(i) != s2.charAt(i)){
					return false;
				}
			}
		}return true;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("First String: ");
		String s1 = scan.next();
		System.out.print("Second String: ");
		String s2 = scan.next();
		boolean result = comp(s1, s2);
		 if (result) {
            System.out.println("equals in charAt()");
        } else {
            System.out.println("not equals in charAt()");
        }
        
		if(s1.equals(s2)){
			System.out.println("equals in built in function");
		}else{
			System.out.println("not equal in built in function");
		}
	}
}