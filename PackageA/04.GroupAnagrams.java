package  PackageA;


import java.util.*;

/**
 *  https://leetcode.com/problems/group-anagrams/
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
class GroupAnagrams {
    /**
     *
     * @param inputArray
     * @return list of lists
     */
    public static List<List<String>>  groupAnagrams(String[] inputArray){

        /**
         * i created hashmap to store each string as key and it's mataching array as array
         */
        Map<String, List<String> > groupedAnagrams;
        groupedAnagrams = new HashMap<>();

        /**
         * loop for every string in the array
         */
        for (String str:inputArray) {
            // get all char in that string as array
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr); // sort this char so i got standard key for that string
            String sortedStr = String.valueOf(charArr); // get the array correspond for this key

            // if it's not exist create new one
            if (!groupedAnagrams.containsKey(sortedStr)){
                groupedAnagrams.put(sortedStr, new ArrayList<>());
            }
            // add the current string to sortedStr key
            groupedAnagrams.get(sortedStr).add(str);
        }
        // return the hashmap value as arrayList
        return new ArrayList<>(groupedAnagrams.values());


    }

    public static void main(String[] args) {

        String[] inputArray = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(inputArray));
    }
}