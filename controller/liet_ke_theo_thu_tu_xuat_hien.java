/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author chien
 */
public class liet_ke_theo_thu_tu_xuat_hien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        BufferedReader br=new BufferedReader(new FileReader("VANBAN.in"));
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a1=(ArrayList<String>)ois.readObject();
        Set<String> se=new TreeSet<>();
        Set<String> se2=new LinkedHashSet<>();
        for(String i:a1){
            se.addAll(Arrays.asList(i.trim().toLowerCase().split("\\s+")));
        }
        String s;
        while((s=br.readLine())!=null){
            String[] a2=s.trim().toLowerCase().split("\\s+");
            for(String i:a2){
                se2.add(i);
            }
        }
        for(String i:se2){
            if(se.contains(i)){
                System.out.println(i);
            }
        }
    }
}
