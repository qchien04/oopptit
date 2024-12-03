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
public class nguyentovathuannghich {
    public static int snt(int i){
        if(i<=1) return 0;
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0) return 0;
        }
        return 1;
    }
    public static int tn(int i){
        String s=i+"";
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)!=s.charAt(s.length()-1-j)) return 0;
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
        
        for(int i:arr1){
            if(snt(i)==1 &&tn(i)==1){
                if(mp1.containsKey(i)){
                    mp1.put(i, mp1.get(i)+1);
                }
                else mp1.put(i, 1);
            }
        }
        for(int i:arr2){
            if(snt(i)==1 &&tn(i)==1){
                if(mp2.containsKey(i)){
                    mp2.put(i, mp2.get(i)+1);
                }
                else mp2.put(i, 1);
            }
        }
        
        for(int i:mp1.keySet()){
            if(mp2.containsKey(i)){
                System.out.println(i+" "+mp1.get(i)+" "+mp2.get(i));
            }
        }
        
        
    }
}
