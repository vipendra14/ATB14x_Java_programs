package ex_12_Logical_Programs;

import java.util.Arrays;

public class Pair_Sum_Array_Sorting {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 21, 11, 15, 18, 5, 12, 10, 13};
        int target = 21;

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int sum = arr[left]+arr[right];

            if (sum == target){
                System.out.println(arr[left] +  ":" + arr[right]);
                left ++;
                right --;

            } else if (sum< target) {
                left++;
            }
            if (sum > target){
                right--;
            }
        }
    }
}




