import java.util.Scanner;

public class MonthAndYearDisplay{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a month: "); 

    String month = input.next();

    System.out.print("Enter a year: "); 

    int year = input.nextInt();

    if (month.equals("January")){
    System.out.println("The number of days in January is 31");
    }

     else if (month.equalsIgnoreCase("Feburary")){
        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
        System.out.println("Number of days in Feburary is 29") ;   
          }   else { 
        System.out.println("Number of days in Febuary is 28");
                } 
        }

    else if (month.equalsIgnoreCase("March")){
    System.out.println("The number of days in March is 31");
    }

    else if (month.equalsIgnoreCase("April")){
    System.out.println("The number of days in April is 30");
    }

      else if (month.equalsIgnoreCase("May")){
    System.out.println("The number of days in May is 31");
    }

    else if (month.equalsIgnoreCase("June")){
    System.out.println("The number of days in May is 30");
    }

    else if (month.equalsIgnoreCase("July")){
    System.out.println("The number of days in July is 31");
    }

    else if (month.equalsIgnoreCase("August")){
    System.out.println("The number of days in August is 31");
    }

    else if (month.equalsIgnoreCase("September")){
    System.out.println("The number of days in September is 30");
    }
    
    else if (month.equalsIgnoreCase("October")){
    System.out.println("The number of days in Octpber is 30");
    }

    else if (month.equalsIgnoreCase("November")){
    System.out.println("The number of days November is 30");
    }
    
    else if (month.equalsIgnoreCase("December")){
    System.out.println("The number of days in December is 31");
    }
 
    }
}
