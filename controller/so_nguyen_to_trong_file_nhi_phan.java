/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author chien
 */
public class so_nguyen_to_trong_file_nhi_phan {
    private static boolean[] nt = new boolean[10002];
    public static void sang(){
        Arrays.fill(nt, true);
        nt[0] = nt[1] = false;

        for (int p = 2; p * p <= 10001; p++) {
            if (nt[p]) {
                for (int j = p * p; j <= 10001; j += p) {
                    nt[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            sang();
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
            ArrayList<Integer> a=(ArrayList<Integer>)ois.readObject();
            
            Map<Integer,Integer> mp=new TreeMap<>();
            
            for(int i:a){
                if(nt[i]){
                    if(mp.containsKey(i)){
                    mp.put(i, mp.get(i)+1);
                    }
                    else{
                        mp.put(i, 1);
                    }
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