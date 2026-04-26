public class BackToSender{
	public static int calculateWages(int deliveryNumber){
    
    int basePay = 5000;
    int calculatedWage = 0;
 
    if (deliveryNumber < 50) { 
        int amountPerParcel = 160;
            calculatedWage = deliveryNumber * amountPerParcel + basePay;
            return calculatedWage;
    }

    else if (deliveryNumber >= 50 && deliveryNumber <= 59){ 
        int amountPerParcel = 200;
            calculatedWage = deliveryNumber * amountPerParcel + basePay;
            return calculatedWage;
    }

    else if (deliveryNumber >= 60 && deliveryNumber <= 69){ 
        int amountPerParcel = 250;
            calculatedWage = deliveryNumber * amountPerParcel + basePay;
            return calculatedWage;

    }

    return calculatedWage = deliveryNumber * 500 + basePay;
    }

}
