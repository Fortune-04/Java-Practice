public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Love"));

    }
    public static String reverseString(String str) {
        String word = "";
        for(int i = str.length()-1 ; i>= 0; i--){
            word = word + str.charAt(i);
        }
        return word;
    }
}
