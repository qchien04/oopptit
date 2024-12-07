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
public class tinhgiochuanchotunggiangvien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<mon> arr1=new ArrayList<>();
        while(t-->0){
            String s[]=sc.nextLine().split("\\s+");
            String ans="";
            for(int i=1;i<s.length;i++){
                ans+=s[i]+" ";
            }
            arr1.add(new mon(s[0], ans.trim()));
        }
         t=Integer.parseInt(sc.nextLine());
        ArrayList<giangvien> arr2=new ArrayList<>();
        while(t-->0){
            String s[]=sc.nextLine().split("\\s+");
            String ans="";
            for(int i=1;i<s.length;i++){
                ans+=s[i]+" ";
            }
            arr2.add(new giangvien(s[0], ans.trim()));
        }
         t=Integer.parseInt(sc.nextLine());
         ArrayList<giochuan> arr3=new ArrayList<>();
        while(t-->0){
            String s[]=sc.nextLine().split("\\s+");
            giochuan gc=new giochuan(s[0], s[1], Double.parseDouble(s[2]));
            for(giangvien i:arr2){
                if(i.getId().equals(s[0])){
                    gc.setG(i);
                    break;
                }
            }
            for(mon i:arr1){
                if(i.getId().equals(s[1])){
                    gc.setM(i);
                    break;
                }

            }
            arr3.add(gc);
        }
        String gv=sc.nextLine();
        for(giangvien i:arr2){
            if(i.getId().equals(gv)){
                System.out.println("Giang vien: "+i.getName());
                break;
            }
        }
        double ton=0;
        for(giochuan i:arr3){
            if(i.getG().getId().equals(gv)){
                System.out.println(i.getM().getName()+" "+i.getGio());
                ton+=i.getGio();
            }
        }
        System.out.println("Tong: "+String.format("%.2f", ton));
        
    }
}
class giochuan{
    private String mon,gv;
    private double gio;
    private giangvien g;
    private mon m;
    public giochuan(String mon, String gv, double gio) {
        this.mon = mon;
        this.gv = gv;
        this.gio = gio;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getGv() {
        return gv;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }

    public double getGio() {
        return gio;
    }

    public void setGio(double gio) {
        this.gio = gio;
    }

    public giangvien getG() {
        return g;
    }

    public void setG(giangvien g) {
        this.g = g;
    }

    public mon getM() {
        return m;
    }

    public void setM(mon m) {
        this.m = m;
    }
    
    
    
}
class giangvien{
    private String id,name;
    private double gio;

    public giangvien(String id, String name) {
        this.id = id;
        this.name = name;
        this.gio = 0;
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

    @Override
    public String toString() {
        return "giangvien{" + "id=" + id + ", name=" + name + ", gio=" + gio + '}';
    }
    
}
class mon{
    private String id,name;

    public mon(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "mon{" + "id=" + id + ", name=" + name + '}';
    }
    
}
