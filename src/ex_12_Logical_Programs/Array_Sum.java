package ex_12_Logical_Programs;

import java.util.Arrays;

public class Array_Sum {

    public static void main(String [] args){

    int [] arr1= {1,2,3};
    int [] arr2= {4,5,6};

    int n = arr1.length;
    int output [] = new int[n];

    for(int i = 0; i<n; i++) {

        output[i] = arr1[i] + arr2[n - 1 - i];
    }
    System.out.println(Arrays.toString(output));

        }
    }


