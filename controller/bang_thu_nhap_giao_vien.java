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
public class bang_thu_nhap_giao_vien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<GV4> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long lcb=Long.parseLong(sc.nextLine());
            arr.add(new GV4(id, name, lcb));
        }
        int ht=1,hp=2;
        for(GV4 i:arr){
            if((i.getId().equals("HT")&&ht<=0)||(i.getId().equals("HP")&&hp<=0)) continue;;
            System.out.println(i);
            if(i.getId().equals("HT")) ht--;
            if(i.getId().equals("HP")) hp--;
        }
    }
}

class GV4{
    private String id,name,cv;
    private long lcb;

    public GV4(String id, String name, long lcb) {
        this.id = id;
        this.name = name;
        this.cv = id;
        this.lcb = lcb;
    }
    private long phucap(){
        String c=cv.substring(0,2);
        if(c.equals("HT")) return 2000000;
        if(c.equals("HP")) return 900000;
        if(c.equals("GV")) return 500000;
        return 0;
    }
    private long hsl(){
        return Long.parseLong(cv.substring(2));
    }
    private long gettotal(){
        return lcb*hsl()+phucap();
    }

    public String getId() {
        return id.substring(0,2);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+hsl()+" "+phucap()+" "+gettotal();
    }
    
}