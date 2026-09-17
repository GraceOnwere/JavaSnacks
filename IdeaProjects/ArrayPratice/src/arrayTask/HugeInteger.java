package arrayTask;

public class HugeInteger {

    private final int [] array = new int [40];

    public int [] parse(String input) {
        int numbers = 40 - input.length();
        for (int index = 0 ; index < input.length(); index++) {
            array[numbers++] = Character.getNumericValue(input.charAt(index));
        }
        return array;
    }

    @Override
    public String toString() {

        String string = "";
        for (int number : array) {
            string += (number);
        }
        return string;
    }

    public int [] add (int number){
        int carry = 0;

//        for (int index = 39; index >= 0; index--) {
//
//            if (array[39] + number > 10) {
//
//
//
//            }
//        }

        return array;
    }

    public static void main (String[] args) {
        HugeInteger hugeInteger = new HugeInteger();

        int [] array = hugeInteger.parse("12345678910");

        hugeInteger.add(200);
        System.out.println(hugeInteger);
    }
}
