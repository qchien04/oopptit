/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class songuyentotrong2filenhiphan {
    public static int snt(int x){
        if(x<=1) return 0;
        if(x==2) return 1;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0) return 0;
        }
        return 1;
    }
    
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream is1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream is2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1=(ArrayList<Integer>) is1.readObject();
        ArrayList<Integer> arr2=(ArrayList<Integer>) is2.readObject();
        
        
        Map<Integer,Integer> mp1=new TreeMap<>();
        Map<Integer,Integer> mp2=new TreeMap<>();
        
        for(Integer i:arr1){
            if(snt(i)==1){
                if(mp1.containsKey(i)){
                    mp1.put(i,mp1.get(i)+1);
                }
                else mp1.put(i,1);
            }
            
        }
        for(Integer i:arr2){
            if(snt(i)==1){
                if(mp2.containsKey(i)){
                    mp2.put(i,mp2.get(i)+1);
                }
                else mp2.put(i,1);
            }
        }
        
        for(int i:mp1.keySet()){
            if(mp2.containsKey(i)){
                System.out.println(i+" "+mp1.get(i)+" "+mp2.get(i));
            }
        }
        
        
    }
}
