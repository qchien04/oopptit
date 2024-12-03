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
public class Nhapxuathang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Hang2> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String xl=sc.nextLine();
            arr.add(new Hang2(id, name, xl));
        }
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String[] a=sc.nextLine().split("\\s+");
            for(Hang2 i: arr){
                if(i.getId().equals(a[0])){
                    i.settongnhap(a);
                    i.settongxuat(a);
                    System.out.println(i);
                    break;
                }
            }
            
            
        }
        
    }
}

class Hang2{
    private String id,name,xl;
    private long pc,tongnhap,tongxuat;

    public Hang2(String id, String name, String xl) {
        this.id = id;
        this.name = name;
        this.xl = xl;
        if(xl.equals("A")){
            this.pc=8;
        }
        else if(xl.equals("B")){
            this.pc=5;
        }
        else if(xl.equals("C")){
            this.pc=2;
        }
 
    }
    public void settongnhap(String[] a){
        long sln=Long.parseLong(a[1]);
            long dgn=Long.parseLong(a[2]);
            long slx=Long.parseLong(a[3]);
        this.tongnhap=sln*dgn;
    }
    public void settongxuat(String[] a){
        long sln=Long.parseLong(a[1]);
            long dgn=Long.parseLong(a[2]);
            long slx=Long.parseLong(a[3]);
        this.tongxuat=slx*dgn/100*(100+pc);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+tongnhap+" "+tongxuat;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getXl() {
        return xl;
    }

    public long getPc() {
        return pc;
    }
    
    
    
    
    
}

