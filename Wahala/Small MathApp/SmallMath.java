public class SmallMath{

    static double numberOne = 2.0;

    static double numberTwo = 2.0;

    public static double additionOperation(double numberOne, double numberTwo){        
 
        double addition = numberOne + numberTwo; 
        
        return addition;
    }

    public static double subtractionOperation(double numberOne, double numberTwo){
       
        double subtraction = numberOne - numberTwo;
        
        return subtraction;
    }

    public static double multiplicationOperation(double numberOne, double numberTwo){

        double multiplication = numberOne * numberTwo;

        return multiplication;
    }

    public static double divisionOperation(double numberOne, double numberTwo){

    if (numberTwo == 0)throw new IllegalArgumentException("zero division operation");

    double division = numberOne  / numberTwo;

    return division;
    }

    public static double getOperation(char operator){

    if (operator == '+')
        
        return additionOperation(numberOne,numberTwo);

    else if (operator == '-')

        return subtractionOperation(numberOne,numberTwo);

    else if (operator == '*')

        return multiplicationOperation(numberOne,numberTwo);

    else if (operator == '/')

        return divisionOperation(numberOne,numberTwo);

    else throw new IllegalArgumentException("Invalid operator");
    }
    
}
