public class FindMissingNumber {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,6,7,8};
        System.out.println(findMissingNum(num));
    }
    public static int findMissingNum(int[] num){
        int comp = 0;
        for(int i=0; i<num.length;i++){
            comp = comp+num[i];
        }
        int val=0;
        for(int j=num[num.length-1]; j>=num[0];j--){
            val=val+j;
        }
        return val-comp;
    }
}
