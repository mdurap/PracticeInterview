package day2;

import java.util.ArrayList;
import java.util.Arrays;

public class uniqueSubstring {

    // String str = "aabbcffththh";
    // output= "cffththh"

    public static String uniqueSub(String str){

        //ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String [] arr= str.split(""); //arr={a,a,b,b,c,f,f,t,h,t,h,h}
        //System.out.println(arr);
      String sub = "";
        for(int i=0; i<= arr.length;i++){ //i=4
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    count++;
                }

            }
            if(count==1){

                int a = str.indexOf(arr[i]);

                sub= str.substring(a);
                return sub;
            }
        }

  return sub;

    }

    public static void main(String[] args) {
        String str = "abbcffa";
        System.out.println(uniqueSub(str));

    }

}
