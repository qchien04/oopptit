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
public class tinhluong2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=Integer.parseInt(sc.nextLine());
        Map<String,String> mp=new HashMap<>();
        while(t-->0){
            String s=sc.nextLine();
            mp.put(s.substring(0,2), s.substring(3));
        }
        
        ArrayList<nhanvien> arr=new ArrayList<>();
         t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            int lcb=Integer.parseInt(sc.nextLine());
            int nc=Integer.parseInt(sc.nextLine());
            nhanvien nv=new nhanvien(id, name, lcb, nc);
            nv.setPhongban(mp.get(id.substring(id.length()-2)));
            arr.add(nv);
        }
        for(nhanvien i:arr){
            System.out.println(i);
        }
    }
}
class nhanvien{
    private String id,name;
    private int lcb,nc;
    private String phongban;
    public nhanvien(String id, String name, int lcb, int nc) {
        this.id = id;
        this.name = name;
        this.lcb = lcb;
        this.nc = nc;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+phongban+" "+getluong()+"000";
    }
    
    private int getluong(){
        return lcb*gethsl()*nc;
    }
    private int gethsl(){
        char c=id.charAt(0);
        int nam=Integer.parseInt(id.substring(1,3));
        if(c=='A'){
            if(nam>=16) return 20;
            if(nam>=9) return 14;
            if(nam>=4) return 12;
            if(nam>=1) return 10;
            return 0;
        }
        if(c=='B'){
            if(nam>=16) return 16;
            if(nam>=9) return 13;
            if(nam>=4) return 11;
            if(nam>=1) return 10;
            return 0;
        }
        if(c=='C'){
            if(nam>=16) return 14;
            if(nam>=9) return 12;
            if(nam>=4) return 10;
            if(nam>=1) return 9;
            return 0;
        }
        if(c=='D'){
            if(nam>=16) return 13;
            if(nam>=9) return 11;
            if(nam>=4) return 9;
            if(nam>=1) return 8;
            return 0;
        }
        return 0;
    }
}