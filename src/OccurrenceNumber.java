public class OccurrenceNumber {
    public static void main(String[] args) {
        int num [] = {1,0,1,1,0,1,1,1};
        System.out.println(occurenceNumber(num));

    }

    public static int occurenceNumber(int [] nums){
        int counter=0;
        int counter1=0;

        for (int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                counter++;
                if(counter > counter1){
                    counter1 = counter;
                }
            }else{
                counter=0;
            }
        }
        return counter1;
    }
}
