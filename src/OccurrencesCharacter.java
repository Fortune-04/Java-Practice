public class OccurrencesCharacter {
    public static void main(String[] args) {
        System.out.println(occurrenceCharacter("accasdqwweccccasdq"));
    }

    public static int occurrenceCharacter(String word){
        char c = 'c';
        int counter=0;
        int counter1=0;
        for(int i =0; i<word.length(); i++){
            if(word.charAt(i) == c){
                counter++;
                if(counter > counter1){
                    counter1 = counter;
                }
            }else{
                counter =0;
            }
        }
        return counter1;
    }
}
//    public static String StringChallenge(String sen) {
//        // code goes here
//        sen = sen.replaceAll("[^a-zA-Z0-9]", " ");
//        int counter = 0;
//        int counter1 = 0;
//        String word="";
//        String word1="";
//        for(int i=0; i<sen.length();i++){
//            if(String.valueOf(sen.charAt(i)) != " "){
//                counter++;
//                word=word+String.valueOf(sen.charAt(i));
//                if(counter > counter1){
//                    counter1 = counter;
//                    word1=word;
//                }
//            }
//        }
//        return word;
//    }
//
//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(StringChallenge(s.nextLine()));
//    }