/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chien
 */
import java.util.*;
public class quanlybanhang1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<khach> arr=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine();
            String gt=sc.nextLine();
            String ns=sc.nextLine();
            String dc=sc.nextLine();
            arr.add(new khach(dc, name, gt, ns, dc));
            
        }
         t=Integer.parseInt(sc.nextLine());
          ArrayList<hang> arr2=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String dv=sc.nextLine();
            long mua=Long.parseLong(sc.nextLine());
            long ban=Long.parseLong(sc.nextLine());
            arr2.add(new hang(dv, name, dv, mua, ban));
            
        }
         t=Integer.parseInt(sc.nextLine());
         ArrayList<hoadon> arr3=new ArrayList<>();
        while(t-->0){
            String k=sc.next();
            String h=sc.next();
            int sl=sc.nextInt();
            hoadon hd=new hoadon(k, h, sl);
            for(khach i:arr){
                if(i.getId().equals(k)){
                    hd.setK(i);
                    break;
                }
            }
            for(hang i:arr2){
                if(i.getId().equals(h)){
                    hd.setH(i);
                    break;
                }
            }
            arr3.add(hd);
            
        }
        for(hoadon i:arr3){
            System.out.println(i);
        }
    }
}


class hoadon{
    private static int stt=0;
    private hang h;
    private khach k;
    private String id,mak,mah;
    private long sl;

    public hoadon() {
    }

    public hoadon(String mak, String mah, long sl) {
        this.id = String.format("HD%03d", ++stt);
        this.mak = mak;
        this.mah = mah;
        this.sl = sl;
    }

    public hang getH() {
        return h;
    }

    public void setH(hang h) {
        this.h = h;
    }

    public khach getK() {
        return k;
    }

    public void setK(khach k) {
        this.k = k;
    }

    public String getMak() {
        return mak;
    }

    public void setMak(String mak) {
        this.mak = mak;
    }

    public String getMah() {
        return mah;
    }

    public void setMah(String mah) {
        this.mah = mah;
    }

    public long getSl() {
        return sl;
    }

    public void setSl(long sl) {
        this.sl = sl;
    }

    @Override
    public String toString() {
        return id+" "+k.getName()+" "+k.getDc()+" "+h.getName()+" "+h.getDv()+" "+h.getMua()+" "+h.getBan()+" "+sl+" "+(sl*h.getBan());
    }
    
    
}
class khach{
    private static int stt=0;
    private String id,name,gt,ns,dc;

    public khach(String id, String name, String gt, String ns, String dc) {
        this.id = String.format("KH%03d", ++stt);
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
    }

    public static int getStt() {
        return stt;
    }

    public static void setStt(int stt) {
        khach.stt = stt;
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

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }
    
}


class hang{
    private static int stt=0;
    private String id,name,dv;
    private long mua,ban;

    public hang(String id, String name, String dv, long mua, long ban) {
        this.id = String.format("MH%03d", ++stt);
        this.name = name;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
    }

    public static int getStt() {
        return stt;
    }

    public static void setStt(int stt) {
        hang.stt = stt;
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

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public long getMua() {
        return mua;
    }

    public void setMua(long mua) {
        this.mua = mua;
    }

    public long getBan() {
        return ban;
    }

    public void setBan(long ban) {
        this.ban = ban;
    }

}