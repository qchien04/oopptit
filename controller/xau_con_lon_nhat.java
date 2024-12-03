package controller;
import java.util.Scanner;

public class xau_con_lon_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res =s.charAt(s.length()-1)+"";
        for(int i=s.length()-2;i>=0;i--){
            if(s.charAt(i)>=res.charAt(0))
                res =s.charAt(i)+ res;
        }
        System.out.println(res);
    }
}