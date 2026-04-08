import java.util.Scanner;
public class TemperatureDisplay{
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first length of the right angle triangle: ");
	
	int a = input.nextInt();

	System.out.print("Enter the second length of the right angle triangle: ");

	int b = input.nextInt();

	double hypotenuse = Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));

	System.out.println(hypotenuse);


	}

}


	
	

	
