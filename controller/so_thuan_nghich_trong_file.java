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

public class so_thuan_nghich_trong_file {
    private static boolean[] nt = new boolean[1000002];
    public static boolean ktra(String s){
        if(s.length()<3) return false;
        if(s.length()%2==0) return false;
        int len=s.length();
        if(s.charAt((len-1)/2)%2==0) return false;
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1) || s.charAt(i)%2==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA1.in"));
            ArrayList<Integer> n=(ArrayList<Integer>)ois1.readObject();
            
            ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("DATA2.in"));
            ArrayList<Integer> m=(ArrayList<Integer>)ois2.readObject();
            
            Map<Integer,Integer> mp=new TreeMap<>();
            Map<Integer,Integer> mp2=new TreeMap<>();
            for(int i:n){
                if(ktra(i+"")){
                    if(mp.containsKey(i)){
                        mp.put(i, mp.get(i)+1);
                    }
                    else{
                        mp.put(i, 1);
                    }
                }
            }
            for(int i:m){
                if(mp.containsKey(i)){
                    mp2.put(i, mp.get(i)+1);
                    mp.put(i,mp.get(i)+1);
                }
            }
            int len=0;
            for (Integer key : mp2.keySet()) {    
                if(len>=10) break;
                System.out.println(key+" "+mp2.get(key));
                len++;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}