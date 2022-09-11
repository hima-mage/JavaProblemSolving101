package  PackageA;

import java.util.Stack;

/**
 * leetcode : didn't find and problem related
 * given stack return it as sorted
 */
class  SortStack {

    /**
     * function that take unsorted stack and return it as sorted stack
     * @param input
     * @return
     */
    static  Stack<Integer> sortStack(Stack<Integer> unsortedStack){
        Stack<Integer> tempStack = new Stack<Integer>();

        // loop while the unsortedStack is not empty
        while (!unsortedStack.isEmpty()){ // isEmpty() O(1)
            // get last element of the unsortedStack
            int temp = unsortedStack.pop(); // pop() O(1)
            while (!tempStack.isEmpty() && tempStack.peek() > temp){ // isEmpty() O(1) , peek() O(1)
                unsortedStack.push(tempStack.pop()); // push() O(1), pop() O(1)
            }
            tempStack.push(temp); // push() O(1)
        }

        return  tempStack;
    }

    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();

        input.push(29);
        input.push(11);
        input.push(22);
        input.push(33);
        input.push(44);
        input.push(11);
        System.out.println(input);
        System.out.println(sortStack(input));

    }
}