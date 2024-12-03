/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author chien
 */
public class tinh_tong {

    public static void main(String[] args) {
        try{
            File f= new File("DATA.in");
            FileReader fr= new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String s;
            long sum=0;
            while((s=br.readLine())!=null){
                String[] res=s.trim().split("\\s+");
                for(String i:res){
                    if(i.matches("\\d+")){
                        if(i.length()<9){
                            sum+=Long.parseLong(i);
                        }
                    }
                }
            }
            System.out.println(sum);
            br.close();
            fr.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
