/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class danh_sach_mon_hoc {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br =new BufferedReader(new FileReader("MONHOC.in"));
        int t=Integer.parseInt(br.readLine());
        ArrayList<Subject> arr=new ArrayList<>();
        while(t-->0){
            String mmh=br.readLine();
            String name=br.readLine();
            int stc=Integer.parseInt(br.readLine());
            arr.add(new Subject(mmh, name, stc));
            
        }
        Collections.sort(arr);
        for(Subject i: arr){
            System.out.println(i);
        }
    }
}
class Subject implements Comparable<Subject>{
    private String mmh;
    public String name;
    private int stc;

    public Subject(String mmh, String name, int stc) {
        this.mmh = mmh;
        this.name = name;
        this.stc = stc;
    }

    public String getMmh() {
        return mmh;
    }

    public void setMmh(String mmh) {
        this.mmh = mmh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStc() {
        return stc;
    }

    public void setStc(int stc) {
        this.stc = stc;
    }
    @Override
    public int compareTo(Subject other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return mmh + " " + name + " " + stc;
    }
    
}