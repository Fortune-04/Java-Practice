package DataStructure;//import java.util.Hashtable;
import java.util.*;

public class HashTableTry {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Yumi");
        table.put(123, "Luna");
        table.put(444,"Yukari");
        table.put(577, "Ayumi");

        for(Integer key : table.keySet()){
            System.out.println(key+"\t"+table.get(key));
        }
    }
}
