package ex_12_Logical_Programs;

public class CheckoneRepeat {

    public static int oneRepeat(int [] arr, int target){

    int count = 0;
    for(int num :arr){
        if (num == target){
            count ++;
        }
    }
if(count > 1){
    return 1;
}
    return  -1;
}

public static void main(String [] args){
        int [] arr = {1,2,3,4,2,5,6,2,2,7,9,2,2,2};
        System.out.println(oneRepeat(arr, 1));
        System.out.println(oneRepeat(arr, 2));
    }
}