import java.util.Map;
import java.util.HashMap;

public class RomanToInteger {

    static Map<String, Integer> values = new HashMap<>();

    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }

    public static int convertRomanToInt(String romanNum){
        int sum = 0;
        int i = 0;

        while(i < romanNum.length()){
            String currentSymbol = romanNum.substring(i, i + 1);
            int currentValue = values.get(currentSymbol);
            int nextValue = 0;
            if(i + 1 < romanNum.length()){
                String nextSymbol = romanNum.substring(i + 1, i + 2);
                nextValue = values.get(nextSymbol);
            }
            if(currentValue < nextValue){
                sum += (nextValue - currentValue);
                i += 2;
            } else{
                sum += currentValue;
                i += 1;
            }
        }
        return sum;
    }

    public static void main(String [] args){

        String testRoman1 = "III";   //3
        String testRoman2 = "LIV"; //54
        String testRoman3 = "MCMXCIV";  //1994
        String testRoman4 = "V";    //5

        System.out.printf("%s in integer form is: %d\n", testRoman1, convertRomanToInt(testRoman1));
        System.out.printf("%s in integer form is: %d\n", testRoman2, convertRomanToInt(testRoman2));
        System.out.printf("%s in integer form is: %d\n", testRoman3, convertRomanToInt(testRoman3));
        System.out.printf("%s in integer form is: %d\n", testRoman4, convertRomanToInt(testRoman4));


    }


}
