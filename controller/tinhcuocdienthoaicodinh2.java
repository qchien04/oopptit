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
public class tinhcuocdienthoaicodinh2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Vung> arr=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int cuoc=Integer.parseInt(sc.nextLine());
            arr.add(new Vung(ma, ten, cuoc));
        }
        ArrayList<Vung2> arr2=new ArrayList<>();
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String[] s=sc.nextLine().split("\\s+");
            String t1[]=s[1].split(":");
            String t2[]=s[2].split(":");
            
            long phut=Integer.parseInt(t2[0])*60-Integer.parseInt(t1[0])*60+
                    Integer.parseInt(t2[1])-Integer.parseInt(t1[1]);
            if(s[0].charAt(0)=='0'){
                String vung=s[0].substring(1,3);
                for(Vung i:arr){
                    if(i.ma.equals(vung)){
                        arr2.add(new Vung2(s[0],i.ten,i.cuoc*phut,phut));
                        break;
                    }
                }

            }
            else{
                phut=(long) Math.ceil((double)phut/3);
                arr2.add(new Vung2(s[0],"Noi mang",800*phut,phut));
            }
            
        }
        Collections.sort(arr2);
            for(Vung2 i:arr2){
                System.out.println(i.ma+" "+i.ten+" "+i.phut+" "+i.cuoc);
            }
        
    }
}
class Vung implements Comparable<Vung>{
    public String ma,ten;
    public long cuoc;

    public Vung(String ma, String ten, long cuoc) {
        this.ma = ma;
        this.ten = ten;
        this.cuoc = cuoc;
    }

    @Override
    public int compareTo(Vung o) {
        return Long.compare(o.cuoc, cuoc);
    }
    
    
}
class Vung2 implements Comparable<Vung2>{
    public String ma,ten;
    public long cuoc,phut;

    public Vung2(String ma, String ten, long cuoc,long phut) {
        this.ma = ma;
        this.ten = ten;
        this.cuoc = cuoc;
        this.phut=phut;
    }

    @Override
    public int compareTo(Vung2 o) {
        return Long.compare(o.cuoc, cuoc);
    }
    
    
}