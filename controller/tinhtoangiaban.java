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
        
public class tinhtoangiaban {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Sp> arr=new ArrayList<>();
        while(t-->0){
            String s[]=sc.nextLine().split("\\s+");
            String id=s[0];
            long gia=Long.parseLong(s[1]);
            long sl=Long.parseLong(s[2]);
            arr.add(new Sp(id, gia, sl));
        }
        
        for(Sp i: arr){
            System.out.println(i);
        }
    }
}

class Sp{
    private String ma;
    private long gia,sl;
    private double thue,pvc;

    public Sp(String ma, long gia, long sl) {
        this.ma = ma;
        if(ma.charAt(0)=='T'){
            this.thue=29;
            this.pvc=4;
        }
        if(ma.charAt(0)=='C'){
            this.thue=10;
            this.pvc=3;
        }
        if(ma.charAt(0)=='D'){
            this.thue=8;
            this.pvc=2.5;
        }
        if(ma.charAt(0)=='M'){
            this.thue=2;
            this.pvc=0.5;
        }
        if(ma.endsWith("C")){
  //          this.thue-=5;
            this.thue*=0.95;
            if(this.thue<0){
                this.thue=0;
            }
        }
        this.gia = gia;
        this.sl = sl;
    }
    public double total(){
        return (gia*sl*((100+thue+pvc)/100)*1.2)/sl;
    }

    @Override
    public String toString() {
        return ma+" "+String.format("%.2f", total());
    }
    
    
}