/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.util.*;
public class lophocphan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<HP> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String stc=sc.nextLine();
            String gv=sc.nextLine();
            arr.add(new HP(id, name, gv, stc));
        }
        t=Integer.parseInt(sc.nextLine());
        Collections.sort(arr);
        while(t-->0){
            String q=sc.nextLine();
            boolean check=true;
            for(HP i:arr){
                if(i.getGv().equals(q)){
                    if(check){
                        System.out.println("Danh sach cho giang vien "+i.getGv()+":");
                        check=false;
                    }
                    System.out.println(i);
                }
            }
        }
        
        
        
        
    }
}


class HP implements Comparable<HP>{
    private String id,name,gv;
    private String stc;

    public HP(String id, String name, String gv, String stc) {
        this.id = id;
        this.name = name;
        this.gv = gv;
        this.stc = stc;
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

    public String getGv() {
        return gv;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }

    public String getStc() {
        return stc;
    }

    public void setStc(String stc) {
        this.stc = stc;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+stc;
    }

    @Override
    public int compareTo(HP o) {
        if(id.compareTo(o.id)!=0) return id.compareTo(o.id);
        return stc.compareTo(o.stc);
    }
    
    
    
}