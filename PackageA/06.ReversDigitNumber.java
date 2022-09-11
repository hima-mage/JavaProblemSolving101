package  PackageA;

/**
 * https://leetcode.com/problems/reverse-integer/
 *
 *
 * the algo
 *      1.get last element by % 10 cuz it's the ones
 *      2.set container = oldcontainer * 10 + reminder
 *      3.remove the last element from the digit number
 */
 class ReverseDigitNumber {

    static  int reverseNumber(int num) {
        // this will be the container
        int reverse = 0;

        while (num != 0 ) {
            // get last element and asign it to reverse + reverse * 10 cuz this means
            if(reverse > Integer.MAX_VALUE/10 || reverse == Integer.MAX_VALUE && num%10 < 7) {
                return  0;
            }
            if(reverse < Integer.MIN_VALUE/10 || reverse == Integer.MIN_VALUE && num%10 < -8) {
                return  0;
            }
            reverse = (reverse*10) +  (num%10);
            num /=  10; // remove last digit from the num

        }
        return reverse;
    }

    public static void main(String[] args) {

//        System.out.println(reverseNumber(1234567));
//        System.out.println(reverseNumber(7654321));
        System.out.println(reverseNumber(1534236469));
    }
}