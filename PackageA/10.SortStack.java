package  PackageA;

import java.util.Stack;

class  SortStack {

    static  Stack<Integer> sortStack(Stack<Integer> input){
        Stack<Integer> tempStack = new Stack<Integer>();

        while (!input.isEmpty()){
            int temp = input.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp){
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
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