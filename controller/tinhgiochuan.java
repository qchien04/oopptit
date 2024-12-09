/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class tinhgiochuan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        Scanner sc2=new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3=new Scanner(new File("GIOCHUAN.in"));
        
        ArrayList<giangvien> arr=new ArrayList<>();
        
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
        }
        
         t=Integer.parseInt(sc2.nextLine());
        while(t-->0){
            String[] s=sc2.nextLine().split("\\s+");
            String name="";
            for(int i=1;i<s.length;i++){
                name+=s[i]+" ";
            }
            arr.add(new giangvien(s[0], name));            
            
        }
         t=Integer.parseInt(sc3.nextLine());
        while(t-->0){
            String[] s=sc3.nextLine().split("\\s+");
            
            
            for(giangvien i:arr){
                if(i.getId().equals(s[0])){
                    i.setGc(Double.parseDouble(s[2]));
                }
            }        
            
        }
        for(giangvien i:arr){
            System.out.println(i.getName()+""+String.format("%.2f", i.getGc()));
        }
        
        
    }
}
class giangvien{
    private String id,name;
    private double gc;
    public giangvien(String id, String name) {
        this.id = id;
        this.name = name;
        this.gc=0;
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

    public double getGc() {
        return gc;
    }

    public void setGc(double gc) {
        this.gc += gc;
    }
    
}