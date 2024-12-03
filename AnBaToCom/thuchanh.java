/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnBaToCom;

/**
 *
 * @author chien
 */
import java.util.*;
public class thuchanh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            long a=Long.parseLong(sc.nextLine());
            double b=a/10;
            long c=a/10;
            System.out.println(a/1010
            );
            System.out.println(c);
        }
        
    }
}


class NhanVien{
    private static int stt=0;
    private String id,name,cv;
    private long lcb,nc;
    


    public NhanVien(String name, long lcb, long nc,String cv) {
        stt++;
        this.name=name;
        this.id=String.format("NV%02d", stt);
        this.nc=nc;
        this.lcb=lcb;
        this.cv=cv;
        
    }   
    private long getluong(){
        return lcb*nc;
    }
    private long getTamUng(){
        if((getPc()+getluong())*2/3<25000){
            long tmp=(long)((getPc()+getluong())*2/3);
            return tmp-(tmp%100);
        }
        return 25000;
    }
    public long getPc(){
        if(cv.equals("GD")) return 500;
        if(cv.equals("PGD")) return 400;
        if(cv.equals("TP")) return 300;
        if(cv.equals("KT")) return 250;
        return 100;
    }

    private long getconlai(){
        return getPc()+getluong()-getTamUng();
    }
    @Override
    public String toString() {
        return id+" "+name+" "+getPc()+" "+getluong()+" "+getTamUng()+" "+getconlai();
    }

    
}