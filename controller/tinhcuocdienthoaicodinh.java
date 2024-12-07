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
public class tinhcuocdienthoaicodinh {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<vung> arr=new ArrayList<>();
        while(t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int cuoc=Integer.parseInt(sc.nextLine());
            arr.add(new vung(ma, ten, cuoc));
        }
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s[]=sc.nextLine().split("\\s+");
            String t1[]=s[1].split(":");
            String t2[]=s[2].split(":");
            long phut=Integer.parseInt(t2[0])*60-Integer.parseInt(t1[0])*60
                    +Integer.parseInt(t2[1])-Integer.parseInt(t1[1]);
            if(s[0].charAt(0)=='0'){
                
                String vung=s[0].substring(1,3);
                
                for(vung i:arr){
                    if(i.getMa().equals(vung)){
                        System.out.println(s[0]+" "+i.getTen()+" "+phut+" "+(phut*i.getCuoc()));
                        
                    }
                }
            }else{
                phut=(long) Math.ceil((double)phut/3);
                System.out.println(s[0]+" "+"Noi mang"+" "+phut+" "+(phut*800));

            }
        }
        
        
        
        
    }
}
class vung{
    private String ma,ten;
    private int cuoc;

    public vung(String ma, String ten, int cuoc) {
        this.ma = ma;
        this.ten = ten;
        this.cuoc = cuoc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCuoc() {
        return cuoc;
    }

    public void setCuoc(int cuoc) {
        this.cuoc = cuoc;
    }
    
}




