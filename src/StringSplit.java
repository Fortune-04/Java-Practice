public class StringSplit {
    public static void main(String[] args) {
        String str = "I have money";
        String [] word = str.split("");
        for(int i = 0; i<word.length; i++){
            System.out.println(word[i]);
        }
    }
}
