package  PackageA;

import java.util.Stack;

/**
 * Find the max element in stack
 * i will use stack as main stack and other maxStack to trace the max element
 *
 * - The java.util.Stack.peek() method in Java is used to retrieve or fetch the first element of the Stack
 * or the element present at the top of the Stack.
 * The element retrieved does not get deleted or removed from the Stack.
 *
 * - Java.util.Stack.push(E element) method is used to push an element into the Stack.
 * The element gets pushed onto the top of the Stack.
 *
 * -The Java.util.Stack.pop() method in Java is used to pop an element from the stack.
 * The element is popped from the top of the stack and is removed from the same.
 */
class FindMaxElementInStack {

    Stack<Integer> mainStack = new Stack<Integer>();
    Stack<Integer> maxStack = new Stack<Integer>();

    /**
     * iam pushing element into mainStack
     * check if the maxstack is empty or it's peek element is less than the inserted element then push it to the stack
     * @param input
     */
    public  void push(int input) {

        mainStack.push(input); // push() O(1)
        if(maxStack.isEmpty() || input >= maxStack.peek()){ // isEmpty() O(1) , peek() O(1)
            maxStack.push(input); // push() O(1)
        }
    }

    /**
     *  pop last element of the main stack and then check the peek element of the maxstack is equal then pop it also ,
     *  and return the popedElement
     * @return
     */
    public int pop() {
        int popedElement = mainStack.pop();// pop() O(1)

        if(maxStack.peek() == popedElement) {  // peek() O(1)
            maxStack.pop();// pop() O(1)
        }
        return popedElement;
    }

    /**
     * find the max by pop the last element of the stack
     * @return
     */
    public  int max() {
        return  maxStack.peek(); // peek() O(1)
    }

    public static void main(String[] args) {
        FindMaxElementInStack findMaxElementInStack = new FindMaxElementInStack();

        findMaxElementInStack.push(23);
        findMaxElementInStack.push(21);
        findMaxElementInStack.push(11);
        findMaxElementInStack.push(26);
        System.out.println(findMaxElementInStack.max());
    }
}