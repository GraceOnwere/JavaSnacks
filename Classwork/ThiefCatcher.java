//write a program that simulates the catching of a thief

//hint the program ends when i shout thief

import java.util.Scanner;

public class ThiefCatcher{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    

    while (true){ 

    System.out.print("Are you a thief?: ");
    
    String response = inputCollector.nextLine();

    
    if (response.equals("yes")){ 

        System.out.print("Shout Thief: ");
        String shoutThief = inputCollector.nextLine();

        String actualResponse = shoutThief.toLowerCase();

    if (actualResponse.trim().equals("thief")){ 

    System.out.println("You are under arrest");
    break;

     }   
}
    if (response.equals("no")){ 
    System.out.println("You're a free man");
    break;
     }
   
} 
    
    }
}

