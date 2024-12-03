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
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author chien
 */
public class cap_so_nguyen_to_trong_file_1 {
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
            ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA1.in"));
            ArrayList<Integer> n=(ArrayList<Integer>)ois1.readObject();
            
            ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("DATA2.in"));
            ArrayList<Integer> m=(ArrayList<Integer>)ois2.readObject();
            
            Set<Integer> se1=new TreeSet<>();
            Set<Integer> se2=new TreeSet<>();
            
            for(int i:n){
                if(nt[i]){
                    se1.add(i);
                }
            }
            for(int i:m){
                if(nt[i]){
                    se2.add(i);
                }
            }      
            for(int i:se1){
                if(i<500000){
                    if(se1.contains(i) && se1.contains(1000000-i) && !se2.contains(i) && !se2.contains(1000000-i)){
                        System.out.println(i+" "+(1000000-i));
                    }
                }
                else break;
            }
        
        
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
