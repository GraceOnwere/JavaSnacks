package Chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//obi is a boy
public class AlgorithmTask {
    public static String getShortestWord(String sentence){

        String[] words =  sentence.split(" ");
        int shortestlength ;
        String shortestword = "";

        ArrayList<String> wordlist = new ArrayList <String> (List.of(words));
        for(String word : wordlist){
            for (Character c : word.toCharArray()){
                if(!Character.isLetter(c)){
                    wordlist.remove(word);
                }
            }
        }
        if(wordlist.size() -1 == 0) return wordlist.getFirst();

       for(int i=0;i<wordlist.size() - 1;i++){
           shortestlength= wordlist.get(i).length();
           if (shortestlength<wordlist.get(i + 1).length() ){
               shortestword=wordlist.get(i);
           }
       }
       return shortestword;
    }

    public static int []  getSquaresOfNumbers(int[] numbers){

        int [] squares = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            squares[i]=numbers[i] * numbers[i];
        }
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares.length - 1; j++) {
                if (squares[j] > squares[j + 1]) {
                    int temp = squares[j];
                    squares[j] = squares[j + 1];
                    squares[j + 1] = temp;
                }
            }
        }
        return squares;
    }

    static void main(String[]args) {

        String sentence = "name's qwerty ";
        System.out.println(getShortestWord(sentence));
        int [] numbers = {3,2,7,1,4};
        System.out.println(Arrays.toString(getSquaresOfNumbers(numbers)));

    }
}