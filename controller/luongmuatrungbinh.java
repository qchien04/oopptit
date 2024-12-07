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
public class luongmuatrungbinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=Integer.parseInt(sc.nextLine());
        Map<String,Mua> mp=new LinkedHashMap<>();
        while(t-->0){
            String kv=sc.nextLine();
            String t1=sc.nextLine();
            String t2=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            if(mp.containsKey(kv)){
                mp.get(kv).tangsl(sl);
                mp.get(kv).tangtime(t1, t2);
            }
            else{
                mp.put(kv, new Mua(kv, t1, t2, sl));
            }
            
        }
        for(String i:mp.keySet()){
            System.out.println(mp.get(i));
        }
        
        
    }
}



class Mua{
    private static int stt=0;
    private String id,kv,t1,t2;
    private int sl,time;

    public Mua(String kv, String t1, String t2, int sl) {
        this.id = String.format("T%02d", ++stt);
        this.kv = kv;
        this.t1 = t1;
        this.t2 = t2;
        this.sl = sl;
        String[] a=t1.split(":");
        String[] b=t2.split(":");
        this.time=Integer.parseInt(b[0])*60
                +Integer.parseInt(b[1])
                -(Integer.parseInt(a[0])*60
                +Integer.parseInt(a[1]));
    }
    
    public void tangsl(int a){
        this.sl+=a;
    }
    public void tangtime(String x,String y){
        String[] a=x.split(":");
        String[] b=y.split(":");
        this.time+=Integer.parseInt(b[0])*60
                +Integer.parseInt(b[1])
                -(Integer.parseInt(a[0])*60
                +Integer.parseInt(a[1]));
    }
    private double gettt(){
        return (double)this.sl/this.time*60;
    }

    @Override
    public String toString() {
        return id+" "+kv+" "+String.format("%.2f", gettt());
    }
    
    
}
