/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class uoc_so_chung_lon_nhat_cua_hai_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s1=sc.next();
            BigInteger n1=new BigInteger(s1);
            BigInteger n2=new BigInteger("11");
            boolean check= (n1.mod(n2).equals(BigInteger.ZERO));
            System.out.println(check?"1":"0");
        }
        
    }
}
