public class OshoFreePromoEngine{

    public static double calculateDiscountedPrice(double cartTotal,String promoCode){


    if (promoCode.equals("STARTER10") && cartTotal >= 5_000 && cartTotal <= 14_999){

        double discount = 0.1;

        double discountedPrice = cartTotal - (discount * cartTotal);

        return discountedPrice;
    }
    
    else if (promoCode.equals("BIGBOY20") && cartTotal >= 15_000 && cartTotal <= 29_999){

         double discount = 0.2;

         double discountedPrice = cartTotal - (discount * cartTotal);

         return discountedPrice;
    }


    else if (promoCode.equals("OSHOFREE35") && cartTotal >= 30_000){

         double discount = 0.35;

         double discountedPrice = cartTotal - (discount * cartTotal);

         return discountedPrice;
    }

    return cartTotal;
    }


}
