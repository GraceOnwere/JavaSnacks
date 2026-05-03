public class IsPrimeNumberFunction{

    public static void main(String[] args){
    
    int number = 35;

    System.out.println(isPrime(number));
    
    }

    public static boolean isPrime (int number){
    
    if (number == 1 )
        return false;

   else if (number % 2 == 0)
        return false;

    for (int counter = 3; counter <= Math.sqrt(number); counter+=2 ){ 

        if (number % counter == 0)
            return false;
}
    return true;
    }

}
    
