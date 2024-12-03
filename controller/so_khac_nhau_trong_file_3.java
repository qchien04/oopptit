/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author chien
 */
public class so_khac_nhau_trong_file_3 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<Integer> a=(ArrayList<Integer>)ois.readObject();
            
            Map<Integer,Integer> mp=new TreeMap<>();
            
            for(int i:a){
                if(mp.containsKey(i)){
                    mp.put(i, mp.get(i)+1);
                }
                else{
                    mp.put(i, 1);
                }
            }
            for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
//            mp.forEach((key, value) -> {
//                System.out.println("Key: " + key + ", Value: " + value);
//            });        
//            for (Integer key : mp.keySet()) {
//                System.out.println("Key: " + key + ", Value: " + mp.get(key));
//            }
        
        
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
