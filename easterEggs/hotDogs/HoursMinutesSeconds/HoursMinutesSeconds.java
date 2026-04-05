import java.util.Scanner;
public class HoursMinutesSeconds{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number of seconds: ");  

    int number = input.nextInt();

    int hours = number / 3600;

    int minutes = number /60;

    int seconds = number;

    System.out.printf("%d seconds = %d hours, %d minutes, %d seconds %n", number, hours , minutes, seconds);

    }
}
