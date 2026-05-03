public class IsEvenFunction{

    public static void main(String[] args){
    
    int number = 19;

    System.out.println(isEven(number));
    
    }

    public static boolean isEven (int number){
    
    if (number % 2 == 0)
        return true;

    return false;
    }
    
}
