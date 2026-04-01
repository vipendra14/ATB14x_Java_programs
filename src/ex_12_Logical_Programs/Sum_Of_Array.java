package ex_12_Logical_Programs;

public class Sum_Of_Array {
    public static void main(String [] args){
        int []arr = {1,2,3,5,9};
        int sum = 0;

        for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
