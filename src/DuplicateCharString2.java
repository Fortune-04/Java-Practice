import java.util.HashMap;
import java.util.Map;

public class DuplicateCharString2 {
    public static void main(String[] args) {
        duplicateCharString2("asasdjfds");
    }

    public static void duplicateCharString2(String str){
        char[] characters = str.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();
        for(Character ch : characters){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
            }else{
                charMap.put(ch,1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+ entry.getValue());
            }
        }

    }
}
