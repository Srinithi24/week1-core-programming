class pens{
	public static void main(String[] args){
		int pen = 14;
		int students = 3;
		int penPerStudent = pen/students;
		int notDistributed = pen % students;
		System.out.println("The pen per student is "+penPerStudent+" and the remaining pen not distributed is "+notDistributed);
	}
}