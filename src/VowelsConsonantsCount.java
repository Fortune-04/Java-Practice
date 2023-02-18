import java.sql.SQLOutput;

public class VowelsConsonantsCount {
    public static void main(String[] args) {
        vowelsConsonantsCount("immortal");
    }

    public static void vowelsConsonantsCount(String str){
        int voCount =0;
        int coCount =0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
                voCount++;
            }else{
                coCount++;
            }
        }

        System.out.println("Vowels : "+voCount);
        System.out.println("Consonant : "+coCount);
    }
}
