import java.util.*;

public class Simple {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String x = scan.nextLine();
//        if(isPalindrome(x)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

        List<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
//        System.out.println(cars);
        System.out.println("ArrayList: "+cars);
        cars.set(1,"TOYOTA");
        System.out.println("New ArrayList: "+cars);
    }
    public static Boolean isPalindrome(String s){
        String word="";
        String nWord= word.replaceAll("\\s", "");
        for(int i=s.length()-1; i >= 0; i--){
            word = word + s.charAt(i);
        }
        word = word.replaceAll("\\s","");
        System.out.println(word);
         if(word.equals(s)){
             return true;
         }else{
             return false;
         }
    }
}
