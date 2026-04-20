import java.util.Scanner;

public class PositiveNumberDisplay {
    public static void main(String[] args){


    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a letter or number to stop: ");

    char input = inputCollector.next();

    int count = 0;

    int  total = 0;

while (true){
    
    count = count + 1;

    System.out.print("Enter a letter or number to stop: ");

    input = inputCollector.nextLine();

    if (input != '')
    break;

    switch (Character.toLowerCasec(input)){

    case 'a':
    System.out.printf("The corresponding keypad number is 2\n");

   /* case (Character.toLowerCasec(ch) == 'b'):
    System.out.printf("The corresponding keypad number is 2\n");

    case (Character.toLowerCasec(ch) == 'c'):
    System.out.printf("The corresponding keypad number is 2\n");

    case (Character.toLowerCasec(ch) == 'd'):
    System.out.printf("The corresponding keypad number is 3\n");

    case (Character.toLowerCasec(ch) == 'e'):
    System.out.printf("The corresponding keypad number is 3\n");

    case (Character.toLowerCasec(ch) == 'f'):
    System.out.printf("The corresponding keypad number is 3\n");

    case (Character.toLowerCasec(ch) == 'g'):
    System.out.printf("The corresponding keypad number is 4\n");

    case (Character.toLowerCasec(ch) == 'h'):
    System.out.printf("The corresponding keypad number is 4\n");

    case (Character.toLowerCasec(ch) == 'i'):
    System.out.printf("The corresponding keypad number is 4\n");

    case (Character.toLowerCasec(ch) == 'j'):
    System.out.printf("The corresponding keypad number is 5\n");

    case (Character.toLowerCasec(ch) == 'k'):
    System.out.printf("The corresponding keypad number is 5\n");

    case (Character.toLowerCasec(ch) == 'l'):
    System.out.printf("The corresponding keypad number is 5\n");

    case (Character.toLowerCasec(ch) == 'm'):
    System.out.printf("The corresponding keypad number is 6\n");

    case (Character.toLowerCasec(ch) == 'n'):
    System.out.printf("The corresponding keypad number is 6\n");

    case (Character.toLowerCasec(ch) == 'o'):
    System.out.printf("The corresponding keypad number is 6\n");
*/
    }

}

    }
}
