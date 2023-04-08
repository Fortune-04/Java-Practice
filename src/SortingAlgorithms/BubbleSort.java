public class BubbleSort {
    public static void main(String[] args) {
        int num[] = {4,1,3,2,9,7};
        bubbleSort(num);
        for (int i: num) {
            System.out.print(i+" ");
        }
    }
    public static int [] bubbleSort(int num[]){
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-j-1; j++) {
                if(num[j]>num[j+1]){
                     int t = num[j];
                     num[j] = num[j+1];
                     num[j+1] = t;
                }
            }
        }
        return num;
    }
}
