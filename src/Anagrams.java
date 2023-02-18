import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str = "love";
        String comp = "vool";
        System.out.println(anagrams(str, comp));

    }
    public static boolean anagrams(String str, String comp){
        char [] word = str.toCharArray();
        Arrays.sort(word);

        char [] word2 = comp.toCharArray();
        Arrays.sort(word2);

        if(word.length != word2.length){
            return false;
        }
        for ( int i=0; i<str.length();i++){
            if(word[i]!=word2[i]){
                return false;
            }
        }
        return true;
    }
}
