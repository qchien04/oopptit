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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author chien
 */
public class so_khac_nhau_trong_file {
    public static void main(String[] args) {
        try{
            File f= new File("DATA.in");
            FileReader fr= new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String s;
            Map<Integer,Integer> mp=new TreeMap<>();
            
            while((s=br.readLine())!=null){
                if(s.trim().equals("")) continue;
                String[] arr=s.trim().split("\\s+");
                for(String i:arr){
                    int a=Integer.parseInt(i);
                    if(mp.containsKey(a)){
                        mp.put(a, mp.get(a)+1);
                    }
                    else{
                        mp.put(a, 1);
                    }
                }
               
            }
            for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
