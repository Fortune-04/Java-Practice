public class ReplaceLetter {
    public static void main(String[] args) {
        String str = "have";
        String comp = "ae";
        replaceLetter(str, comp);

    }

    public static void replaceLetter(String str, String comp){
//        String [] letter = new String[str.length()];
        String [] letter = str.split("");
        for(int i=0; i<str.length();i++){
            for(int j=0; j<comp.length();j++){
                if(letter[i].equals(String.valueOf(comp.charAt(j))) ){
                    letter[i]= "--"+letter[i]+"--";
                }
            }
        }
        for(int z=0; z<letter.length;z++){
            System.out.print(letter[z]);
        }

    }
}
