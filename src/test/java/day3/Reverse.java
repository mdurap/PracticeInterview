package day3;

public class Reverse {
    public static void main(String[] args) {
        String name="Alim Dincer";
        String reverse=new StringBuilder(name).reverse().toString();
        System.out.println(reverse);


        String reverse1="";
        for ( int i=name.length()-1; i>=0; i--){
           reverse1=reverse1+name.charAt(i);

        }
        System.out.println(reverse1);


    }


}
