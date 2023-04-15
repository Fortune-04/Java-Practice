public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = {4,5,2,6,7,8,1,2,3,5};
        insertionSort(nums);
        for(int num: nums){
            System.out.print(num);
        }
    }
    public static int[] insertionSort(int num[]){
        for (int i = 1; i < num.length; i++) {
            int j = i;
            while (j > 0 && num[j-1] > num[j]){
                int temp = num[j];
                num[j] = num[j-1];
                num[j-1]= temp;
                j--;
            }
        }
        return num;
    }
}
