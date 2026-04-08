public class SimpleInterest{

    public static void main(String[] args){

    int principal = 5000;

    double annualRate = 5.0 /100;
    
    int time = 10;

    double monthlyInterestRate = annualRate / 12;

    double simpleInterest = (principal * annualRate * time);

    double compoundInterest = principal * Math.pow((1 + monthlyInterestRate) , (time * 12)) ;
 
    System.out.printf("The simple interest is %.2f while the compound interest is %.2f%n", simpleInterest, compoundInterest);

    }

}
