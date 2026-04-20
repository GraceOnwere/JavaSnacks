import java.util.Scanner;

public class PositiveNumberDisplay {
    public static void main(String[] args){


    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number: ");

    int number = inputCollector.nextInt();

    int count = 0;

    int  total = 0;

for (; number >= 0; ){ 
    
    count = count + 1;    

    //System.out.println(count);
    
    total +=number;

    System.out.print("Enter number: ");

    number = inputCollector.nextInt();

    if (number < 0)
        break;

    
}   

if (count == 0)

    System.out.printf("Sorry input a postive number\n");

else if (count != 0){ 
double average = ((double)total)/count ;

System.out.printf("The average of all postive numbers is %.2f\n", average);
}

    }
}
