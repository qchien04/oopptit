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
public class diemdanh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SV5> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            arr.add(new SV5(id, name, lop));
        }
        t=arr.size();
        
        while(t-->0){
            String a[]=sc.nextLine().split("\\s+");
            for(SV5 i:arr){
                if(i.getId().equals(a[0])){
                    i.setB(a[1]);
                }
            }
        }
        String lop=sc.nextLine();
        for(SV5 i:arr){
            if(i.getLop().equals(lop)){
                System.out.println(i);
            }
        }
    }
}
class SV5{
    private String id,name,lop,b;


    public SV5(String id, String name, String lop) {
        this.id = id;
        this.name = name;
        this.lop = lop;
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    public String tinhdiem(){
        String s=b;
        int cnt=10;
        for(char i:s.toCharArray()){
            if(i=='m') cnt-=1;
            else if(i=='v') cnt-=2;
        }
        if(cnt>0) return cnt+"";
        return "0 KDDK";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+lop+" "+tinhdiem();
    }
    
}
