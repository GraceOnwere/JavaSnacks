import java.util.Scanner;
public class MonthlySavingAmount{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a monthly saving amount: ");

    int monthlySavingAmount = input.nextInt();

    double accountValueMonth_1 = monthlySavingAmount + 0.003125;
    
    System.out.println("Amount saved for the first month: " + accountValueMonth_1);

    double accountValueMonth_2 = accountValueMonth_1 + 0.003125;

    System.out.println("Amount saved for the second month: " + accountValueMonth_2);

    double accountValueMonth_3 = accountValueMonth_2 + 0.003125;

    System.out.printf("Amount saved for the third month: %f%n" , accountValueMonth_3);

    double accountValueMonth_4 = accountValueMonth_3 + 0.003125;

    System.out.printf("Amount saved for the fourth month: %f%n" , accountValueMonth_4);

    double accountValueMonth_5 = accountValueMonth_4 + 0.003125;

    System.out.printf("Amount saved for the fifth month: %f%n" , accountValueMonth_5);

    double accountValueMonth_6 = accountValueMonth_5 + 0.003125;

    System.out.printf("Amount saved for the sixth month: %f%n", accountValueMonth_6);


    }
}
