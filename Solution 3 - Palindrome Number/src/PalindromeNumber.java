public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        /*
        1. x < 0 then, that automatically means that
           x is not a palindrome since there will be
           no negative on the opposite side to reverse

        2. If the first digit of x = 0, then isPalindrome
           must return false since there will never be a 0 on
           the other side to reverse.
         */

        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int revertedNumber = 0;

        while(x > revertedNumber){
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }

    public static void main(String [] args){
        //True Test Cases
        int testNum1 = 1220221;
        int testNum2 = 4334;
        int testNum3 = 1457541;

        //False Test Cases
        int testNum4 = 10;
        int testNum5 = -121;
        int testNum6 = 435134;

        //True Test Cases
        //Test 1
        System.out.printf("It is %s that %d is a a palindrome number.\n", isPalindrome(testNum1), testNum1);
        //Test 2
        System.out.printf("It is %s that %d is a a palindrome number.\n", isPalindrome(testNum2), testNum2);
        //Test 3
        System.out.printf("It is %s that %d is a a palindrome number.\n\n", isPalindrome(testNum3), testNum3);

        //False Test Cases
        //Test 4
        System.out.printf("It is %s that %d is a a palindrome number.\n", isPalindrome(testNum4), testNum4);
        //Test 5
        System.out.printf("It is %s that %d is a a palindrome number.\n", isPalindrome(testNum5), testNum5);
        //Test 6
        System.out.printf("It is %s that %d is a a palindrome number.\n", isPalindrome(testNum6), testNum6);
    }


}
