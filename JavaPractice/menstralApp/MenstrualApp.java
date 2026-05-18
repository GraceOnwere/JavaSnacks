import java.util.Scanner;

public class MenstrualApp{

    public static void main(String[] args){

    Scanner inputCollectorTwo = new Scanner (System.in);

    System.out.print("Do you have 3-6 months of your Menstrual Cycle length? (y/n): ");

    String answer = inputCollectorTwo.nextLine();

    if (answer == 'y'){ 

    int numberOfMonths = inputCollectorTwo.nextInt();

    int  cycleDays = (cycleLength(numberOfMonths));

    System.out.println("Your next cycle is in " + cycleDays + " days");

    System.out.println("Your flow state is between 3-7 days");

    
   
    }

    else if (answer == 'n'){ 

    System.out.print("Enter your last period cycle: ");

    int lastPeriod = inputCollectorTwo.nextInt();

    
    

    

    

    
    

    
    

    }

    public static int cycleLength (int number){ 

    Scanner inputCollector = new Scanner (System.in); 

    if (number == 3 || number == 6){ 

    int numberOfCycles [] = new int [number];   
    
    System.out.print("Enter the " + numberOfCycles.length + " Cycles: ");
    
     for (int counter = 0; counter < numberOfCycles.length; counter++){
        numberOfCycles[counter] = inputCollector.nextInt();
    }
     int total = 0;

     for (int counter = 0; counter < numberOfCycles.length; counter++){
        total = total + numberOfCycles[counter];
    }
        
     int predictedCycle = total / numberOfCycles.length;
    
    return predictedCycle;  
    }   

    return 0; 
     }


    public static int lastPeriod (int number){ 

    Scanner inputCollector = new Scanner (System.in); 

    if (number < 21 || number > 35)
    System.out.println("Out of normal menstrual cycle length. Kindly visit your Doctor");

    else if (number >= 21 && number <= 35){
    
    int nextPeriod = 
    
    int fertileWindow = (((number - 14) - 5) + 2);
    }
        

    

}
