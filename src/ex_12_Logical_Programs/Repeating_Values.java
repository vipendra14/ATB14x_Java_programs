package ex_12_Logical_Programs;
// I have a set of array, return 1 if 1 is repeating more than once equal to the length of Array,
// 2/7 times the array return 1, and return -1 if 1 is not repeating values

public class Repeating_Values {

    public  static int repeatingnum(int []arr){
        int count = 0;

        for(int num : arr){
            if(num == 5){
                count++;
            }
        }
        if(count > 1){
            return 1;
        }
        return -1;
    }
    public static void main(String []args){
        int [] arr = {1,2,3,5,6,4,5,5,5,7,8,9};
        System.out.println(repeatingnum(arr));
    }
}
