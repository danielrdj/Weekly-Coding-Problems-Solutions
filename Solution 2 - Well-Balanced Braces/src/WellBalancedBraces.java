public class WellBalancedBraces {

    /*
    1. The number of opening braces cannot exceed that of the closing braces.

    2. Consider two sets of braces "A" and "B"
       If the opening brace of "A" is followed by the opening brace of "B"
       then the closing brace of "B" must occur before the closing brace of "A"
       to be considered a well-formed list.
     */

    public static boolean isBalanced(String braces) {
        String closingBraces = "";

        for(int i = 0; i < braces.length(); ++i){
            char currentChar = braces.charAt(i);

            if(closingBraces.length() == 0 && (currentChar == ')' || currentChar == ']' || currentChar == '}')){
                return false;
            } else {
                if (currentChar == '('){
                    closingBraces = closingBraces.concat(")");
                } else if (currentChar == '{'){
                    closingBraces = closingBraces.concat("}");
                } else if (currentChar == '['){
                    closingBraces = closingBraces.concat("]");
                } else if (currentChar == closingBraces.charAt(closingBraces.length() - 1)){
                    closingBraces = closingBraces.substring(0, closingBraces.length() - 1);
                } else {
                    return false;
                }
            }
        }

        return closingBraces.length() == 0;
    }



    public static void main(String[] args){
        //Should return true.
        String testCase1 = "([])[]({})";

        //Should return true.
        String testCase2 = "{[([])[]({})]}";

        //Should return false.
        String testCase3 = "([)]";

        //Should return false.
        String testCase4 = "((()";

        //Test prints
        //TEST 1
        System.out.printf("For: %s\nIt is %s that this list is formed correctly.\n", testCase1, isBalanced(testCase1));
        System.out.println();
        //TEST 2
        System.out.printf("For: %s\nIt is %s that this list is formed correctly.\n", testCase2, isBalanced(testCase2));
        System.out.println();
        //TEST 3
        System.out.printf("For: %s\nIt is %s that this list is formed correctly.\n", testCase3, isBalanced(testCase3));
        System.out.println();
        //TEST 4
        System.out.printf("For: %s\nIt is %s that this list is formed correctly.\n", testCase4, isBalanced(testCase4));
        System.out.println();
    }

}
