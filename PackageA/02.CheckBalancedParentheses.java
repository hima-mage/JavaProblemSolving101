package PackageA;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * ------------------------------------------
 *   stack :
 *      1.any open parentheses we push it to stack
 *      2.any closing
 */
class  SolutionTwo {

    // i will use map (hasmap) to set parenthesis to check my char if it's valide or not
    static Map<Character , Character> map = new HashMap<Character , Character>();

    /**
     * This method is used to associate the specified value with the specified key in this map.
     * map put(K key, V value)
     */
    static {
        map.put( '(' , ')');
        map.put( '[' , ']');
        map.put( '{' , '}');
    }

    static Boolean validateExpression(String expression) {

        // if not even then it's not balanced
        if(expression.length() % 2 == 1) {
            return false;
        }
        // create stack to track the char if it's parenthesis or not
        Stack<Character> stack = new Stack<Character>();

        /**
         *
         * HashMap.containsKey() method is used to check whether a particular key is being mapped into the HashMap or not.
         *      It takes the key element as a parameter and returns True if that element is mapped in the map.
         * Stack.push(E element) method is used to push an element into the Stack.
         *      The element gets pushed onto the top of the Stack.
         *  stack.pop() is used to pop an element from the stack.
         *          The element is popped from the top of the stack and is removed from the same.
         * The map.get() method of Map interface in Java is used to retrieve or fetch the value
         *          mapped by a particular key mentioned in the parameter.
         *          It returns NULL when the map contains no such mapping for the key.
         */
        for(char c:expression.toCharArray()) {
            // if it's open parentheses  add it to stack
            if(map.containsKey(c)){
                stack.push(c);
            }
            /**
             * if it's not parentheses , then it must be closing parentheses ,
             *      so check if last element in stack is the open parentheses for that closing one and remove it.
             * if stack is empty this means the closing parentheses has no opening one
             * get value of last element in stack and check if it's value is same as our current element the closing one
             */
            else if (stack.isEmpty() || map.get(stack.pop()) != c) {
                return   false;
            }
        }

        return stack.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        Boolean output1 = SolutionTwo.validateExpression("{()}");
        Boolean output2 = SolutionTwo.validateExpression("{(");


        System.out.println(output1);
        System.out.println(output2);
    }
}