package DataStructure;

import java.util.Stack;

public class StackTry {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("One");
        stack.add("Two");
        stack.add("Three");
        stack.add("Four");

        System.out.println(stack);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }

//    int low = 0;
//    int high = numbers.length-1;
//
//        while (low <= high){
//        int middlePossition = (low+high)/2;
//        int middleNumber = numbers[middlePossition];
//
//        if(numToFind == middleNumber){
//            return middlePossition;
//        }
//        if(numToFind<middleNumber){
//            high=middlePossition-1;
//        }else{
//            low =middlePossition+1;
//        }
//    }
//        return -1;
}
