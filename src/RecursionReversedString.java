public class RecursionReversedString {
    public static void main(String[] args) {
        recursionReversedString("Immortal", 1);
    }

    public static void recursionReversedString(String str, int n){
        int i = str.length()-n;

        System.out.print(str.charAt(i));
        n= n+1;
        if(n>str.length()){
            return;
        }
        recursionReversedString(str, n);
    }
}
