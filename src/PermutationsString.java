public class PermutationsString {
    public static void main(String[] args) {
        String s = "abb";
        permutationsString(s, "");

        int[] num = new int[9];
    }

    public static void permutationsString(String str, String ans){
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                        str.substring(i + 1);

            // Recursive call
            permutationsString(ros, ans + ch);
        }
    }
}
