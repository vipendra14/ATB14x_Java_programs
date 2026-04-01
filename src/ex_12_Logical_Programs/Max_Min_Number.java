package ex_12_Logical_Programs;

public class Max_Min_Number {

    public static void main(String[] args) {

    int [] arr = {25, 37, 96, 84, 12, 21, 56};

    int max = arr[0];
    int min = arr[0];

    for (int i = 0; i<arr.length; i++){
        if(arr[i]> max){
            max = arr[i];
        }
        if(arr[i]<min){
            min = arr[i];
        }
    }
    System.out.println(max);
    System.out.println(min);
    }
}
