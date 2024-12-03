/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

/**
 *
 * @author chien
 */
public class tach_doi_va_tinh_tong {

    public static void main(String[] args) {
        try{
            File f= new File("DATA.in");
            FileReader fr= new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String s;
            s=br.readLine();
            while(s.length()>1){
                String num1=s.substring(0, s.length()/2);
                String num2=s.substring(s.length()/2);
                
                BigInteger s1=new BigInteger(num1);
                BigInteger s2=new BigInteger(num2);
                
                BigInteger sum= s1.add(s2);
                
                s=sum.toString();
                System.out.println(s);
                if(s.length()==1){
                    break;
                }
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
