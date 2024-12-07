/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class hoadonkhachsan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<KS> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String phong=sc.nextLine();
            String n1=sc.nextLine();
            String n2=sc.nextLine();
            int dv=Integer.parseInt(sc.nextLine());
            arr.add(new KS(name, phong, n1, n2, dv));
        }
        Collections.sort(arr);
                
        for(KS i:arr){
            System.out.println(i);
        }
    }
}

class KS implements Comparable<KS>{
    private static int stt=0;
    private String id,name,phong,n1,n2;
    private int dv;

    public KS(String name, String phong, String n1, String n2,int dv) {
        this.id = String.format("KH%02d", ++stt);
        this.name = name;
        this.phong = phong;
        this.n1 = n1;
        this.n2 = n2;
        this.dv=dv;
    }
    
    
    private int getgiatang(){
        char c=phong.charAt(0);
        if(c=='1') return 25;
        if(c=='2') return 34;
        if(c=='3') return 50;
        return 80;
    }
    
    private long getngay() throws ParseException{
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        Date d1=df.parse(n1);
        Date d2=df.parse(n2);
        return (d2.getTime()-d1.getTime())/3600000/24+1;

    }
    private long gettotal() throws ParseException{
        return getngay()*getgiatang()+dv;
    }
    @Override
    public String toString() {
        try {
            return id+" "+name+ " "+ phong+" "+getngay()+" "+(gettotal()) ;
        } catch (ParseException ex) {
            Logger.getLogger(KS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    @Override
    public int compareTo(KS o) {
        try {
            return Long.compare(o.gettotal(), gettotal());
        } catch (ParseException ex) {
            Logger.getLogger(KS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        }
    
    
    
    
    
    
}


