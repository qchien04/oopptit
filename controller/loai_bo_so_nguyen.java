/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author chien
 */
public class loai_bo_so_nguyen {

    public static void main(String[] args) {
        try{
            File f= new File("DATA.in");
            FileReader fr= new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String s;
            ArrayList<String> se=new ArrayList<>();
            while((s=br.readLine())!=null){
                if(s.trim().equals(""))continue;
                String[] res=s.trim().split("\\s+");
                for(String i:res){
                    try {
                        Integer.parseInt(i);
                    } catch (Exception e) {
                        se.add(i);
                    }
                }
            }
            Collections.sort(se);
            for(String i:se){
                System.out.print(i+" ");
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
        }
    }
}
