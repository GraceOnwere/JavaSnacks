import java.util.Random;

public class RainbowColorDisplay{

    public static void main(String[] args){

    Random rand = new Random();
  
    int number = rand.nextInt(7) + 1;

    if (number == 1){
    System.out.println("Red is the first color of the rainbow");
    }    

    if (number == 2){
    System.out.println("Orange is the second color of the rainbow");
    }    

    if (number == 3){
    System.out.println("Yellow is the third color of the rainbow");
    }    

    if (number == 4){
    System.out.println("Green is the fourth color of the rainbow");
    }    

    if (number == 5){
    System.out.println("Blue is the fifth color of the rainbow");
    }    

    if (number == 6){
    System.out.println("Indigo is the sixth color of the rainbow");
    }    

    if (number == 7){
    System.out.println("Violet is the first color of the rainbow");
    }    

    //System.out.println(number);
    
    } 

}
