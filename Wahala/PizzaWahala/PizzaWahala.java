import java.util.Scanner;

public class PizzaWahala{

    public static void main(String[] args){


    String pizzaTable =  """
    ________________________________________________
    | Pizza type | Number of Slices | Price per box|
    |____________|__________________|______________|
    | Sapa Size  |         4        |      2500    |
    |____________|__________________|______________|
    | Small Money|         6        |      2900    |
    |____________|__________________|______________|
    | Big boys   |         8        |      4000    |
    |____________|__________________|______________|
    | Odogwu     |        12        |      5200    |
    |____________|__________________|______________|
    """
    ; 

    System.out.println(pizzaTable);

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter the number of Guest: ");

    int numberofGuest = inputCollector.nextInt();

    inputCollector.nextLine();

    System.out.print("Enter the type of Pizza: ");

    String typeofPizza = inputCollector.nextLine();


    switch (typeofPizza){ 

    case "Sapa Size":

    double numberofBoxes;

    double slicePerBox;

    double leftOver;

    double price;

    switch(numberofGuest % 4){
    case 0:
    
    numberofBoxes = numberofGuest / 4.0;
    
    slicePerBox = numberofBoxes * 4.0;

    leftOver = slicePerBox - numberofGuest;

    price = 2500 * numberofBoxes;
 
    System.out.printf("\nNumber of boxes of pizza to buy = %.0f boxes (explanation: Sapa Size contains 4 slices per box, %.0f boxes should be sufficient for %d persons as it would contain %.0f slice(s) in all)\n", numberofBoxes,numberofBoxes,numberofGuest,slicePerBox);

    System.out.printf("\nNumber of left over slices after serving = %.0f (explanation: After serving %d slices(s), you sholud have %.0f slices left)\n",leftOver, numberofGuest,leftOver);

    System.out.printf("Price = %d (explanation: 2500 per box for %.0f boxes)\n", price, numberofBoxes);    
    
    break;

    default:

    numberofBoxes = Math.round((numberofGuest + 1)/ 4.0);
    
    slicePerBox = numberofBoxes * 4.0;

    leftOver = slicePerBox - numberofGuest;

    price = 2500 * numberofBoxes;
 
    System.out.printf("\nNumber of boxes of pizza to buy = %.0f boxes (explanation: Sapa Size contains 4 slices per box, %.0f boxes should be sufficient for %d persons as it would contain %.0f slice(s) in all)\n", numberofBoxes,numberofBoxes,numberofGuest,slicePerBox);

    System.out.printf("\nNumber of left over slices after serving = %.0f (explanation: After serving %d slices(s), you sholud have %.0f slices left)\n",leftOver, numberofGuest,leftOver);

    System.out.printf("Price = %.0f (explanation: 2500 per box for %.0f boxes)\n", price, numberofBoxes); 
    
        }
    break;

    case "Small Money":

    switch(numberofGuest % 6){
    case 0:
    
    numberofBoxes = numberofGuest / 6.0;
    
    slicePerBox = numberofBoxes * 6.0;

    leftOver = slicePerBox - numberofGuest;

    price = 2900 * numberofBoxes;

       System.out.printf("\nNumber of boxes of pizza to buy = %.0f boxes (explanation: Small Money contains 6 slices per box, %.0f boxes should be sufficient for %d persons as it would contain %.0f slice(s) in all)\n", numberofBoxes,numberofBoxes,numberofGuest,slicePerBox);

    System.out.printf("\nNumber of left over slices after serving = %.0f (explanation: After serving %d slices(s), you sholud have %.0f slices left)\n",leftOver, numberofGuest,leftOver);

    System.out.printf("Price = %d (explanation: 2900 per box for %.0f boxes)\n", price, numberofBoxes);    
    
    break;

    default:

    numberofBoxes = Math.round((numberofGuest + 1)/ 6.0);
    
    slicePerBox = numberofBoxes * 6.0;

    leftOver = slicePerBox - numberofGuest;

    price = 2900 * numberofBoxes;
 
    System.out.printf("\nNumber of boxes of pizza to buy = %.0f boxes (explanation: Small Money contains 6 slices per box, %.0f boxes should be sufficient for %d persons as it would contain %.0f slice(s) in all)\n", numberofBoxes,numberofBoxes,numberofGuest,slicePerBox);

    System.out.printf("\nNumber of left over slices after serving = %.0f (explanation: After serving %d slices(s), you sholud have %.0f slices left)\n",leftOver, numberofGuest,leftOver);

    System.out.printf("Price = %.0f (explanation: 2900 per box for %.0f boxes)\n", price, numberofBoxes); 
    
        }
    break;


    case "Big boys":

    switch(numberofGuest % 8){
    case 0:
    
    numberofBoxes = numberofGuest / 8.0;
    
    slicePerBox = numberofBoxes * 8.0;

    leftOver = slicePerBox - numberofGuest;

    price = 4000 * numberofBoxes;

       System.out.printf("\nNumber of boxes of pizza to buy = %.0f boxes (explanation: Big boys contains 8 slices per box, %.0f boxes should be sufficient for %d persons as it would contain %.0f slice(s) in all)\n", numberofBoxes,numberofBoxes,numberofGuest,slicePerBox);

    System.out.printf("\nNumber of left over slices after serving = %.0f (explanation: After serving %d slices(s), you sholud have %.0f slices left)\n",leftOver, numberofGuest,leftOver);

    System.out.printf("Price = %d (explanation: 4000 per box for %.0f boxes)\n", price, numberofBoxes);    
    
    break;

    default:

    numberofBoxes = Math.round((numberofGuest + 1) / 8.0);
    
    slicePerBox = numberofBoxes * 8.0;

    leftOver = slicePerBox - numberofGuest;

    price = 4000 * numberofBoxes;
 
    System.out.printf("\nNumber of boxes of pizza to buy = %.0f boxes (explanation: Big boys contains 8 slices per box, %.0f boxes should be sufficient for %d persons as it would contain %.0f slice(s) in all)\n", numberofBoxes,numberofBoxes,numberofGuest,slicePerBox);

    System.out.printf("\nNumber of left over slices after serving = %.0f (explanation: After serving %d slices(s), you sholud have %.0f slices left)\n",leftOver, numberofGuest,leftOver);

    System.out.printf("Price = %.0f (explanation: 4000 per box for %.0f boxes)\n", price, numberofBoxes); 
    
        }

    break;

    case "Odogwu":

    switch(numberofGuest % 12){
    case 0:
    
    numberofBoxes = numberofGuest / 12.0;
    
    slicePerBox = numberofBoxes * 12.0;

    leftOver = slicePerBox - numberofGuest;

    price = 5200 * numberofBoxes;

       System.out.printf("\nNumber of boxes of pizza to buy = %.0f boxes (explanation: Odogwu contains 12 slices per box, %.0f boxes should be sufficient for %d persons as it would contain %.0f slice(s) in all)\n", numberofBoxes,numberofBoxes,numberofGuest,slicePerBox);

    System.out.printf("\nNumber of left over slices after serving = %.0f (explanation: After serving %d slices(s), you sholud have %.0f slices left)\n",leftOver, numberofGuest,leftOver);

    System.out.printf("Price = %d (explanation: 5200 per box for %.0f boxes)\n", price, numberofBoxes);    
    
    break;

    default:

    numberofBoxes = Math.round((numberofGuest + 1) / 12.0);
    
    slicePerBox = numberofBoxes * 12.0;

    leftOver = slicePerBox - numberofGuest;

    price = 5200 * numberofBoxes;
 
    System.out.printf("\nNumber of boxes of pizza to buy = %.0f boxes (explanation: Odogwu contains 12 slices per box, %.0f boxes should be sufficient for %d persons as it would contain %.0f slice(s) in all)\n", numberofBoxes,numberofBoxes,numberofGuest,slicePerBox);

    System.out.printf("\nNumber of left over slices after serving = %.0f (explanation: After serving %d slices(s), you sholud have %.0f slices left)\n",leftOver, numberofGuest,leftOver);

    System.out.printf("Price = %.0f (explanation: 5200 per box for %.0f boxes)\n", price, numberofBoxes); 
    
        }

    break;

    
}





 
    }
}
