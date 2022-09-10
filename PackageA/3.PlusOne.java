package PackageA;

import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 *  The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 * Constraints:
 *
     * 1 <= digits.length <= 100
     * 0 <= digits[i] <= 9
     * digits does not contain any leading 0's.
 *
 * Note that : this increment could lead to increase array length
 */
class  PlusOne {

    public  static int[] plusOne(int[] input) {
        //  iterate from last element and keep dig down until first element
        for (int i = input.length-1; i >= 0; i--) {
            // if the element < 9 , just increment it and break the loop out
            if(input[i] < 9) {
                input[i]++;
                return input; // this will update the input with increment and return it
            }
            // if it = 9 , replace it with 0 , and keep loop the prev elements
            input[i] = 0;
        }

        // here all array elements are 9's so just create new one and add 1 in first element, and others will be 0's by default
        int[] result = new int[input.length+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {

        int[] input1 = {1,2,3};
        System.out.println(Arrays.toString(plusOne(input1)));

        int[] input2 = {1,0,9};
        System.out.println(Arrays.toString(plusOne(input2)));

        int[] input3 = {1,9,9};
        System.out.println(Arrays.toString(plusOne(input3)));

        int[] input4 = {9,9,9};
        System.out.println(Arrays.toString(plusOne(input4)));

    }
}