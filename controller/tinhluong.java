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
public class tinhluong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,String> pb=new HashMap<>();
        ArrayList<NV> arr=new ArrayList<>();
        
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String[] s=sc.nextLine().split("\\s+");
            String a="";
            for(int i=1;i<s.length;i++){
                a+=s[i]+" ";
            }
            a=a.substring(0, a.length()-1);
            pb.put(s[0], a);
        }
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long lcb=Long.parseLong(sc.nextLine());
            long snc=Long.parseLong(sc.nextLine());
            String phongban=pb.get(id.substring(3));
            arr.add(new NV(id, name, lcb, snc,phongban));
        }
        
        String q=sc.nextLine();
        System.out.println("Bang luong phong "+pb.get(q)+":");
        
        for(NV i:arr){
            if(i.getId().equals(q))
                System.out.println(i);
        }
        
    }
}
class NV{
    private String id,name,phongban;
    private long lcb,snc;

    
    public NV(String id, String name, long lcb, long snc,String phongban) {
        this.id = id;
        this.name = name;
        this.lcb = lcb;
        this.snc = snc;
        this.phongban=phongban;
    }
    public String getId() {
        return id.substring(3);
    }

    public long getluong(){
        return lcb*snc*gethsl()*1000;
    }
    public long gethsl(){
        char nhom=id.charAt(0);
        int kn=Integer.parseInt(id.substring(1,3));
        if(nhom=='A'){
            if(kn>=16) return 20;
            if(kn>=9) return 14;
            if(kn>=4) return 12;
            if(kn>=1) return 10;
        }
        if(nhom=='B'){
            if(kn>=16) return 16;
            if(kn>=9) return 13;
            if(kn>=4) return 11;
            if(kn>=1) return 10;
        }
        if(nhom=='C'){
            if(kn>=16) return 14;
            if(kn>=9) return 12;
            if(kn>=4) return 10;
            if(kn>=1) return 9;
        }
        if(nhom=='D'){
            if(kn>=16) return 13;
            if(kn>=9) return 11;
            if(kn>=4) return 9;
            if(kn>=1) return 8;
        }
        return 0;
        
    }
    @Override
    public String toString() {
        return id+" "+name+" "+getluong();
    }
    
    
    
    
    
}