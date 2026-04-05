import java.util.Scanner;
public class PricePerUnitWeight{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first weight of the rice (in kg): ");  

    double firstWeight = input.nextDouble();

    System.out.print("Enter first price of the rice: ");  

    double firstPrice = input.nextDouble();

    System.out.print("Enter second weight of the rice (in kg): "); 

    double secondWeight = input.nextDouble();

    System.out.print("Enter second price of the rice: "); 

    double secondPrice = input.nextDouble();

    double pricePerOneKgForFirstRice =   firstPrice / firstWeight ;

    double pricePerOneKgForSecondRice = secondPrice / secondWeight ;

    if (pricePerOneKgForFirstRice < pricePerOneKgForSecondRice ){
    System.out.println("The first bag of rice is the better cost per unit");
    }     
    
    else if (pricePerOneKgForSecondRice < pricePerOneKgForFirstRice){
    System.out.println("The second bag of rice is the better cost per unit");
    }

    else 
    System.out.println("You can go for any of the bags of rice");

}
    }
