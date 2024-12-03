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
public class so_nguyen_to_lon_nhat_trong_file {
    private static boolean[] nt = new boolean[1000002];
    public static void sang(){
        Arrays.fill(nt, true);
        nt[0] = nt[1] = false;

        for (int p = 2; p * p <= 1000001; p++) {
            if (nt[p]) {
                for (int j = p * p; j <= 1000001; j += p) {
                    nt[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            sang();
//            for(int i=1;i<=10001;i++){
//                if(nt[i]) System.out.print(i+" ");
//            }
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
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
            ArrayList<String> ans=new ArrayList<>();
            int len=mp.size();
            for (Integer key : mp.keySet()) {       
                if(len<=10){
                    ans.add(key+" "+mp.get(key));
                }
                len--;
            }
            for(int i=9;i>=0;i--){
                System.out.println(ans.get(i));
            }
        
        
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
