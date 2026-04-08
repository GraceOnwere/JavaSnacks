import java.util.Scanner;
public class TemperatureDisplay{
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a temperature in Celsius: ");
	
	double temperature = input.nextDouble();

	if (temperature < 0){
	System.out.println("Freezing (below 0)");
	}

	else if (temperature >= 0 && temperature <= 15){
	System.out.println("Cold (0-15)");
	}

	else if (temperature >= 16 && temperature <= 25){
	System.out.println("Warm (16-25)");
	}

	else 
	System.out.println("Hot (above 25)");
	
	}
}