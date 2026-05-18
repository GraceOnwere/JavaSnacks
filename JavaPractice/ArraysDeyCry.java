import java.util.Scanner;
public class ArraysDeyCry{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    double myList [] = new double [10];

    System.out.print("Enter " + myList.length + " values: "  );

    for (int counter = 0; counter < myList.length; counter++){
        myList[counter] = inputCollector.nextDouble();
        }

    double total = 0;
    for (int counter = 0; counter < myList.length; counter++){
        total = total + myList[counter];
        System.out.println(total);   
        
        }




    char [] city = {'D', 'A', 'L','L','A','S'};

    for (int counter = 0; counter < city.length; counter++){
            System.out.printf("%s%s",city[counter]," ");   
        
        }
    System.out.println();
    }
}
