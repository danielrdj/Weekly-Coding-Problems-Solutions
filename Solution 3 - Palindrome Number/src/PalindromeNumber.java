public class PalindromeNumber {

    //2^31 - 1 = 2147483647
    //There are 10 digits in this number
    public static boolean isPalindrome(int x) {
        //Special Cases:
        //1. x < 0 automatically means that x is not
        //   a palindrome since there will be no negative
        //   on the opposite side to reverse
        //
        //2. If the first digit of x = 0 then x must be 0 since
        //   there will never be a 0 on the opposite side to reverse

        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber){ //Will end halfway through the given number and then compare
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10; //Doesn't include decimal, so it will chop the 1's digit.
        }
        //x == revertedNumber/10 accounts for and odd number of digits in x
        //The middle digit will always be equal to itself; therefore, we can disregard it
        return x == revertedNumber || x == revertedNumber/10;
    }

    public static void main(String [] args){
        //True Test Cases
        int testNum1 = 1220221;
        int testNum2 = 434;
        int testNum3 = 14577541;

        //False Test Cases
        int testNum4 = 10;
        int testNum5 = 1000000000;
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
