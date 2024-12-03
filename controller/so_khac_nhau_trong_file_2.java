/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author chien
 */
public class so_khac_nhau_trong_file_2 {
    public static void main(String[] args) {
        try{
            DataInputStream dis=new DataInputStream(new FileInputStream("DATA.IN"));
            int num;
            Map<Integer,Integer> mp=new TreeMap<>();
            
            for(int i=0;i<100000;i++){
                num=dis.readInt();
                if(mp.containsKey(num)){
                    mp.put(num, mp.get(num)+1);
                }
                else{
                    mp.put(num, 1);
                }
            }
            for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            dis.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
