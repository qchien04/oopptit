/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author chien
 */
public class liet_ke_tu_khac_nhau {
    public static void main(String[] args) {
        try{
            File f= new File("src/helloptit/Hello.txt");
            FileReader fr= new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String s;
            Set<String> se=new TreeSet<>();
            
            while((s=br.readLine())!=null){
                if(s.trim().equals("")) continue;
                String[] arr=s.trim().split("\\s+");
                for(String i:arr){
                    se.add(i.toLowerCase());
                }
               
            }
            for(String i:se){
                System.out.println(i);
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
