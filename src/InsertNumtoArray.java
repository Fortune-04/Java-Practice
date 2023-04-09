public class InsertNumtoArray {
    public static void main(String[] args) {
        int num = 1234;
        insertNumtoArray(num);
        int [] nums = insertNumtoArray(num);
        for(int i=0 ; i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }

    public static int [] insertNumtoArray(int num){
        char [] digits = String.valueOf(num).toCharArray();
        int[] value= new int[digits.length];
        for(int i=0; i< digits.length;i++){
            value[i] = Integer.parseInt(String.valueOf(digits[i]));
        }
        return value;
    }
}

