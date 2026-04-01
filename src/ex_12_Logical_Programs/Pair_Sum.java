package ex_12_Logical_Programs;

public class Pair_Sum {
    public static void main(String[] args) {
        int []arr = {1, 8, 6, 21, 11,15, 18, 5, 12, 10, 13};
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j]==21){
                    System.out.println(arr[i] + ":" + arr[j]);
                }
            }
        }
    }



}
