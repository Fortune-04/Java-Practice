package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTry {
    public static void main(String[] args) {
        Queue<String> numList = new LinkedList<>();
        numList.add("one");
        numList.add("two");
        numList.add("three");

        System.out.println(numList);

        System.out.println(numList.peek());
        System.out.println(numList.size());
        System.out.println(numList.remove());
        System.out.println(numList);
    }
}
