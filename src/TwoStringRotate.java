public class TwoStringRotate {
    public static void main(String[] args) {
        System.out.println(twoStringRotate("XYZ", "ZYX"));

    }
    public static boolean twoStringRotate(String str, String comp){
        if(str.length()!= comp.length()){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != comp.charAt(comp.length()-1-i)){
                return false;
            }
        }

        return true;
    }
}
