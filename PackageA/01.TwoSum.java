package PackageA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

   You may assume that each input would have exactly one solution, and you may not use the same element twice.

   You can return the answer in any order.
 *
 *
 */
class TowSum {


    public static  int[] twoSum(int[] inputArray , int target ) {

        // check if the array if empty or null
        if(inputArray == null || inputArray.length < 2) {
            throw new IllegalArgumentException("invalid input array");
        }

        Map<Integer , Integer> trackerMap  = new HashMap<>();

        for(int i = 0; i<inputArray.length; i++) {
            int reminder = target - inputArray[i];

            // if the remaining exist in map return it
            if(trackerMap.containsKey(reminder)) {
                // return the index of that reminder and the current element index
                return new int[] {trackerMap.get(reminder) , i };
            }

            trackerMap.put(inputArray[i], i);

        }

        throw new IllegalArgumentException("invalid input , no two sum found");


    }

    public static void main(String a[] ) {
        // input array {}
        int[] i = {3,4,7};

        System.out.println(Arrays.toString(twoSum(i , 10)));
    }



}