class price{
	public static void main(String[] args){
		int costPrice = 129;
		int sellingPrice = 191;
		int profit = sellingPrice - costPrice;
		float profitPercentage = ((float) profit/costPrice) *100f;
		System.out.println("The Cost Price is INR "+costPrice+ " and Selling Price INR "+sellingPrice +"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage );
		
	}
}