package  PackageA;

/**
 * A peak element is an element that is strictly greater than its neighbors.
 *
 * Given a 0-indexed integer array nums, find a peak element, and return its index.
 * If the array contains multiple peaks, return the index to any of the peaks.
 *
 * You may imagine that nums[-1] = nums[n] = -∞.
 * In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
 *
 * You must write an algorithm that runs in O(log n) time.
 *
 */
class FindPeakElement {


    public  static  Integer peakElement(int[] inputArray) {

        if(inputArray == null  || inputArray.length == 0){
            return -1;
        }
        if (inputArray.length == 1)
            return 0;

        int length = inputArray.length;
        int start = 0;
        int end = length - 1;

        while (start <= end){
            // start point
            int mid = (start + end) / 2;
            if((mid == 0 || inputArray[mid-1] <= inputArray[mid])
                &&
                (mid == length-1 || inputArray[mid] >= inputArray[mid+1] ) ) {
                return  mid;
            } else if  ( mid > 0 && inputArray[mid-1] > inputArray[mid] ) {
                end = mid -1 ;
            } else {
                start = mid +1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] inputArray1 = {1,2,3,1};
        System.out.println(peakElement(inputArray1));

        int[] inputArray2 = {1,2,1,3,5,6,4 };
        System.out.println(peakElement(inputArray2));
    }
}