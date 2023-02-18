public class DuplicateCharString {
    public static void main(String[] args) {
        System.out.println(duplicateCharString("ama", 'a'));
    }
    public static int duplicateCharString(String str, char letter){
        int counter = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== letter){
                counter++;
            }
        }
        return counter;
    }
}
