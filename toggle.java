import java.util.Scanner;
class toggle{
	public static String toggled(String str){
		StringBuilder res = new StringBuilder();
		
		for(int i=0; i< str.length(); i++){
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)){
				res.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch)){
				res.append(Character.toUpperCase(ch));
			}
			else{
				res.append(ch);
			}
		}return res.toString();
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text =  scan.nextLine();
		String result = toggled(text);
		System.out.println(result);
		scan.close();
	}
}