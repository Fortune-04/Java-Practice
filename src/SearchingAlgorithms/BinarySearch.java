package SearchingAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {1,3,2,7,5,8,9,11,34};
        bubbleSort(nums);
        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(binarySearch(nums, 5));
    }

    private static int [] bubbleSort(int[] numbers){
        for(int i=0; i<numbers.length;i++){
            for(int j=0; j<numbers.length-1-j;j++){
                if(numbers[j]>numbers[j+1]){
                    int t = numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1]=t;
                }
            }
        }
        return numbers;
    }

    private static int binarySearch(int [] numbers, int numToFind){
        int low = 0;
        int high = numbers.length-1;

        while(low <= high){
            int middlePossition = (low+high)/2;
            int middleNumber = numbers[middlePossition];

            if(numToFind== middleNumber){
                return middlePossition;
            }
            if(numToFind<middleNumber){
                high = middlePossition-1;
            }else{
                low = middlePossition+1;
            }
        }

        return -1;
    }
}
