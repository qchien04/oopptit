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
public class bangtinhgiochuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
        }
        ArrayList<GiangVien> arr=new ArrayList<>();
         t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s[]=sc.nextLine().split("\\s+");
            String ans="";
            for(int i=1;i<s.length;i++){
                ans+=s[i]+" ";
            }
            arr.add(new GiangVien(s[0], ans));
        }
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s[]=sc.nextLine().split("\\s+");
            for(GiangVien i:arr){
                if(i.getId().equals(s[0])){
                    i.setGio(Double.parseDouble(s[2]));
                }
            }
            
        }
        for(GiangVien i:arr){
                System.out.println(i);
            }
    }
}
class GiangVien{
    private String id,name;
    private double gio;

    public GiangVien(String id, String name) {
        this.id = id;
        this.name = name;
        this.gio = 0;
    }

    @Override
    public String toString() {
        return name+""+String.format("%.2f", gio);
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

    public double getGio() {
        return gio;
    }

    public void setGio(double gio) {
        this.gio += gio;
    }
    
}
