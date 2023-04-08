public class ReverseArrayString {
    public static void main(String[] args) {
        String[] str = {"A","B","C"};
        System.out.println(reverseArrayString(str));
    }
    public static String reverseArrayString(String [] str){
        String word = "";
        for (String w: str) {
            word = word + w;
        }
        return word;
    }
}
