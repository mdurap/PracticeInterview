package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseInt {
    public static void main(String[] args) {
        int arr=12345;
        String str=Integer.valueOf(arr).toString();
        String s=""+arr;
        System.out.println(s);
        String rev=new StringBuilder(s).reverse().toString();
        System.out.println(rev);
        int reverseArr=Integer.parseInt(rev);
        System.out.println(reverseArr);
        List<String>reverse2=new ArrayList<>();

        String []srr=rev.split("");
        System.out.println(Arrays.toString(srr));
    }

}
