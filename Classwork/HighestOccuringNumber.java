public class HighestOccuringNumber{
    public static void main(String[] args){

    int firstArray [] = {1,5,5,2,3};

    int checkIndex = 1;

    
    int counter = 0;

    for(int count = 0; count < firstArray.length;count++){ 

        if (firstArray[count] == firstArray[checkIndex] && checkIndex < firstArray.length){ 
            counter++;
            checkIndex = checkIndex + 1;
         }

        
    }

    System.out.println(counter);
    }
}































