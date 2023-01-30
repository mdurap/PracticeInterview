package day1;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fibonacci(10)));


    }

    public static int[] fibonacci(int num){
        //{1,1,2,3,5,8,13,...}
        int[] arr = new int[num];

        if(num>0) {

            arr[0] = 1;
            arr[1] = 1;

            for (int i = 2; i < num; i++) {
                arr[i] = arr[i - 2] + arr[i - 1];  //arr[2]=arr[1]+arr[0];
            }
        }else{
            System.out.println("invalid input");
        }


        return arr;
    }

}
