import java.util.HashMap;

public class AverageTime {
    public static void main(String[] args) {
        String [] time = {"001,10.00","002,20.00","003,10.00","001,20.00"};
        System.out.println(averageTime(time));
    }
    public static float averageTime(String[] time){
        float total = 0;
        HashMap<String, Float> charmap = new HashMap<>();
        for(int i = 0; i<time.length;i++){

            String [] str = time[i].split(",");
            charmap.put(str[0],Float.parseFloat(str[1]));
        }
        for(Float i: charmap.values()){
            total = total + i;
        }
        return total/3;
    }
}
