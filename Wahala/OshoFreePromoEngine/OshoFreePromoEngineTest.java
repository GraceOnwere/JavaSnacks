import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest{

    @Test
    public void testThatIReceiveCartTotalAndPromoCodeAndReturnDiscountPrice(){

    double cartTotal = 5_000;

    String promoCode = "STARTER10";

    double discountedPrice = 4_500.0;

    double expectedDiscountedPrice = OshoFreePromoEngine.calculateDiscountedPrice(cartTotal,promoCode);

    assertEquals(expectedDiscountedPrice,discountedPrice);
    
    }

    @Test 
    public void testAllValidPromoCode(){

    double cartTotal = 29_999;

    String bigBoyPromoCode = "BIGBOY20";

    double discountedPrice = 23_999.2;

    
    double expectedDiscountedPrice = OshoFreePromoEngine.calculateDiscountedPrice(cartTotal,bigBoyPromoCode);

    assertEquals(expectedDiscountedPrice,discountedPrice);


    cartTotal = 30_000;

    String oshoFreePromoCode = "OSHOFREE35";
    discountedPrice = 19_500.0;

    
    expectedDiscountedPrice = OshoFreePromoEngine.calculateDiscountedPrice(cartTotal,oshoFreePromoCode);

    assertEquals(expectedDiscountedPrice,discountedPrice);

    
    }

    @Test
    public void testThatIGetCartTotalForInvalidPromoCode(){

    double cartTotal = 18_000;

    String promoCode = "FAKE419";

    double discountedPrice = 18_000.0;

    double expectedDiscountedPrice = OshoFreePromoEngine.calculateDiscountedPrice(cartTotal,promoCode);

    assertEquals(expectedDiscountedPrice,discountedPrice);
        
    }
}
