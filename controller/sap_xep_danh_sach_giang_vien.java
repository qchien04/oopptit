/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class sap_xep_danh_sach_giang_vien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Teacher> arr= new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String subject=sc.nextLine();
            arr.add(new Teacher(name, subject));
        }
        int n=Integer.parseInt(sc.nextLine()); 
        while(n-->0){
            String s=sc.nextLine();
            String[] s1=s.split("\\s+");
            String ans="";

            for(String i:s1){
                ans+=(i.charAt(0)+"").toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+ans+":");
            for(Teacher i: arr){
                if(i.getSubject().equals(s)){
                    System.out.println(i);
                }
            }
        }
    }
}

class Teacher implements Comparable<Teacher>{
    private String id,name,subject;
    private static int stt=0;
    public Teacher(String name, String subject) {
        stt++;
        this.id=String.format("GV%02d", stt);
        this.name = name;
        this.subject = subject;
    }
    private String getShortS(){
        String[] s=subject.split("\\s+");
        String ans="";
        
        for(String i:s){
            ans+=(i.charAt(0)+"").toUpperCase();
        }
        return ans;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static int getStt() {
        return stt;
    }

    public static void setStt(int stt) {
        Teacher.stt = stt;
    }
    private String getFirstName(){
        String[] s=name.split("\\s+");
        return s[s.length-1];
    }
    @Override
    public int compareTo(Teacher o) {
        if(!this.getFirstName().equals(o.getFirstName())){
            return this.getFirstName().compareTo(o.getFirstName());
        }
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+getShortS();
    }
    
    
    
    
}