public class SubtotalAndGratuityRate{

    public static void main(String[] args){

    double subtotal = 20;

    double gratuityRate = 22/ 100.0;

    double changedGratuityRate = gratuityRate * 10;

    double changedSubtotal = subtotal +  changedGratuityRate ;

    System.out.println("Gratuity rate is " + changedGratuityRate + " and Subtotal is " + changedSubtotal);

    
    }

}
