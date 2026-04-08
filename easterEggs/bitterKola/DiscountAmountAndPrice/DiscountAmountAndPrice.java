public class DicountAmountAndPrice{

	public static void main(String[] args){
	
	int price = 2000;
	
	double discount = 10 / 100;

	double discountedAmount = price * discount;

	double finalPrice = price - discountedAmount;

	System.out.println(finalPrice);
	}
}

