package  PackageA;

import java.util.Stack;

/**
 *
 * make stack to store the word char in backward
 */
 class ReverseWord {

    public static void reverseWord(String word) {

        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i< word.length(); i++) {
             Character c = word.charAt(i);
             if(c == ' '){
                    while (!stack.isEmpty()) {
                        // here i print out the stack and empty it in same time
                        System.out.print(stack.pop());
                    }
                    // here to make separated space between the prev word and the next on , if there is any
                    System.out.print(" ");
             } else {
                 // add each char into the stack
                stack.push(c);
             }
        }
        // if the stack not empty pop it - means display the rest and empty it in same time
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        String input = "hello world";

        reverseWord(input);
    }
}