/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chien
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class tinhngayhethanbaohanh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MUAHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<hang> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            int gia=Integer.parseInt(sc.nextLine());
            int bh=Integer.parseInt(sc.nextLine());
            arr.add(new hang(id, name, gia, bh));
        }
         t=Integer.parseInt(sc.nextLine());
        ArrayList<khach> arr2=new ArrayList<>();
        while(t-->0){
            
            String name=sc.nextLine();
            String dc=sc.nextLine();
            String msp=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            String ngay=sc.nextLine();
            khach k=new khach(name, dc, msp, ngay, sl);
            
            arr2.add(k);
            for(hang i:arr){
                if(i.getId().equals(msp)){
                    k.setH(i);
                    break;
                }
            }
        }  
        Collections.sort(arr2);
        for(khach i:arr2){
            System.out.println(i);
        }
        
    }
}
class khach implements Comparable<khach>{
    private static int stt=0;
    private String id,name,dc,msp,ngay;
    private int sl;
    private hang h;
    public khach(String name, String dc, String msp, String ngay, int sl) {
        this.id = String.format("KH%02d", ++stt);
        this.name = name;
        this.dc = dc;
        this.msp = msp;
        this.ngay = ngay;
        this.sl = sl;
    }

    public hang getH() {
        return h;
    }
    private String getngayhethan(){
        String s[]=ngay.split("\\/");
        int nam=Integer.parseInt(s[2]);
        nam+=h.getBh()/12;
        
        int bh=h.getBh()%12;
        int thang=bh+Integer.parseInt(s[1]);

        if(thang>12){
            thang%=12;
            nam+=1;
        }
        return s[0]+"/"+String.format("%02d", thang)+"/"+nam;
        
    }
    public void setH(hang h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+dc+" "+msp+" "+(sl*h.getGia())+" "+getngayhethan();
    }

    @Override
    public int compareTo(khach o) {
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date d=df.parse(getngayhethan());
            Date d2=df.parse(o.getngayhethan());
            if(d.compareTo(d2)!=0) return d.compareTo(d2);
            return id.compareTo(o.id);
        } catch (ParseException ex) {
            Logger.getLogger(khach.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    
}
class hang{
    private String id,name;
    private int gia,bh;

    public hang(String id, String name, int gia, int bh) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.bh = bh;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGia() {
        return gia;
    }

    public int getBh() {
        return bh;
    }
    
}