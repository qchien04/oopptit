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
import java.util.*;
public class danhsachthuctap3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("SINHVIEN.in"));
        Scanner sc2=new Scanner(new File("DN.in"));
        Scanner sc3=new Scanner(new File("THUCTAP.in"));
        
        ArrayList<Sinhvien> svarr=new ArrayList<>();
        ArrayList<DN> dnarr=new ArrayList<>();
        ArrayList<ThucTap> ttarr=new ArrayList<>();
        
        
        
        int t=Integer.parseInt(sc1.nextLine());
        while(t-->0){
            String id=sc1.nextLine();
            String name=sc1.nextLine();
            String lop=sc1.nextLine();
            String mail=sc1.nextLine();
            svarr.add(new Sinhvien(id, name, lop, mail));
        }
        t=Integer.parseInt(sc2.nextLine());
        while(t-->0){
            String id=sc2.nextLine();
            String name=sc2.nextLine();
            int sl=Integer.parseInt(sc2.nextLine());
            dnarr.add(new DN(id, name, sl));
        }
        Collections.sort(svarr);
        
        t=Integer.parseInt(sc3.nextLine());
        
        while(t-->0){
            String[] s=sc3.nextLine().split("\\s+");
            ThucTap tt=new ThucTap();
            
            for(Sinhvien i:svarr){
                if(i.getId().equals(s[0])){
                    tt.setS(i);
                }
            }
            for(DN i:dnarr){
                if(i.getId().equals(s[1])){
                    tt.setD(i);
                }
            }
            ttarr.add(tt);
            
        }
        t=Integer.parseInt(sc3.nextLine());
        Collections.sort(ttarr);
        while(t-->0){
            String id=sc3.nextLine();
            String x="";
            int sl=0;
            for(DN i:dnarr){
                if(i.getId().equals(id)){
                    x=i.getName();
                    sl=i.getSl();
                }
            }
            System.out.println("DANH SACH THUC TAP TAI "+x+":");
            for(ThucTap i:ttarr){
                if(i.getD().getId().equals(id)){
                    if(sl>0){
                        System.out.println(i);
                        sl--;
                    }
                }
            }
        }
        
    }
}

class Sinhvien implements Comparable<Sinhvien>{
    private String id,name,lop,mail;

    
    public Sinhvien(String id, String name, String lop, String mail) {
        this.id = id;
        String ans="";
        String[] s=name.split("\\s+");
        for(String i:s){
            ans+=(i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase())+" ";
        }
        this.name = ans.trim();
        this.lop = lop;
        this.mail = mail;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+lop;
    }

    @Override
    public int compareTo(Sinhvien o) {
return id.compareTo(o.id);    }
    
}
class DN{
    private String id,name;
    private int sl;

    public DN(String id, String name, int sl) {
        this.id = id;
        this.name = name;
        this.sl = sl;
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

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
}

class ThucTap implements Comparable<ThucTap>{
    private Sinhvien s;
    private DN d;

    public ThucTap() {
    }

    public Sinhvien getS() {
        return s;
    }

    public void setS(Sinhvien s) {
        this.s = s;
    }

    public DN getD() {
        return d;
    }

    public void setD(DN d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return s.toString();
    }

    @Override
    public int compareTo(ThucTap o) {
        return s.getId().compareTo(o.s.getId());
        
        
    }
    
    
    
}