/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class thongketukhacnhautrongfilevanban {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream is=new ObjectInputStream(new FileInputStream("DATA.in"));
        
        ArrayList<String> arr=(ArrayList<String>) is.readObject();
        Map<String,word> mp=new HashMap<>();
        String regex="[^a-z0-9]+";
        for(String j:arr){
            String s[]=j.trim().toLowerCase().split(regex);
            for (String i : s) {
                if (i.length()>0) { 
                    if (mp.containsKey(i)) {
                        mp.get(i).cnt += 1;
                    } else {
                        mp.put(i, new word(i, 1));
                    }
                }
            }
        }
        ArrayList<word> arr2=new ArrayList<>(mp.values());
        Collections.sort(arr2);
        for(word i:arr2){
            System.out.println(i.w+" "+i.cnt);
        }
        
    }
}
class word implements Comparable<word>{
    String w;
    int cnt;

    public word(String w, int cnt) {
        this.w = w;
        this.cnt = cnt;
    }

    @Override
    public int compareTo(word o) {
        return o.cnt!=cnt?o.cnt-cnt:w.compareTo(o.w);
    }
    
}