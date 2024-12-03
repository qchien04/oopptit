/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnBaToCom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class coll_kt2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        TaiLieu s=new Sach("s001", "lap trinh", "ok", 12, "nxb", 333);
        TaiLieu tapchi=new TapChi("s001", 67, 12, "nxb",100);
        ChucNang cn=new ThucHien();
//        cn.nhapSach(in);
        cn.out();
        cn.xoaMa("b8988");
        cn.xoaMa("TC001");
        cn.xoaNhieu("Tran Dinh Que");
        cn.out();
    }
}

class TaiLieu{
    private String ma,tenNXB;
    private int soBanPH;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNXB, int soBanPH) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }
    
}
interface ChucNang{
    public void nhapSach(Scanner in);
    public void nhapTapChi(Scanner in);
    public void out();//toan bo ds
    public <T> void out(List<T> arr);
    public void timTheoMa(String ma);//viet ra
    public List<Sach> timTheoTenSach(String key);
    public List<TaiLieu> timTheoTuDen(int from,int to);
    public void xoaMa(String ma);
    public void xoaNhieu(String tacGia);//sach
    public void suaCha(String ma);//tai lieu
    public void suaCon(String ma);//tap chi

}
class Sach extends TaiLieu{
    private String tenSach,tenTG;
    private int soTrang;

    public Sach() {
    }


    public Sach(String ma, String tenSach, String tenTG, int soTrang, String tenNXB, int soBanPH) {
        super(ma, tenNXB, soBanPH);
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return  getMa().toUpperCase()+" "+tenSach+" "+tenTG+" "+ soTrang+" "+getTenNXB()+" "+getSoBanPH() ;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
}
class TapChi extends TaiLieu{
    private int so,thang;

    public TapChi() {
        
    }


    public TapChi(String ma,int so, int thang,  String tenNXB, int soBanPH) {
        super(ma, tenNXB, soBanPH);
        this.so = so;
        this.thang = thang;
    }
    
    @Override
    public String toString() {
        return  getMa().toUpperCase()+" "+so+" "+thang+" "+getTenNXB()+" "+getSoBanPH() ;
    }
}
class ThucHien implements ChucNang{
    private List<TaiLieu> a;
    private static int sMa=0;

    public ThucHien() {
        a=new ArrayList<>();
        a.add(new Sach("S001", "LTHDT", "Tran Dinh Que", 120, "PTIT", 1000));
        a.add(new Sach("S002", "lT java", "Tran Dinh Que", 120, "PTIT", 1000));
        a.add(new Sach("S003", "kt do hoa", "Trinh Thi Van Anh", 120, "PTIT", 1000));
        a.add(new TapChi("TC001", 2, 8, "KHCN", 90));
        a.add(new TapChi("TC004", 1, 6, "Kim Dong", 80));
    }
    private int getViTri(String ma){
        for(int i=0;i<a.size();i++){
            if(a.get(i).getMa().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return -1;
    }
    
    private TaiLieu nhap(Scanner in){
        return new TaiLieu(String.format("%03d", sMa++),in.nextLine(),Integer.parseInt(in.nextLine()));
    }
    
    
    
    @Override
    public void nhapSach(Scanner in) {
        TaiLieu t=nhap(in);
        a.add(new Sach("S"+t.getMa(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),t.getTenNXB(), t.getSoBanPH()));
        
    }

    @Override
    public void nhapTapChi(Scanner in) {
        TaiLieu t=nhap(in);
        a.add(new TapChi("TC"+t.getMa(), Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()),t.getTenNXB(), t.getSoBanPH()));    
    }

    @Override
    public void out() {
        a.forEach(t-> System.out.println(t));
    }

    @Override
    public <T> void out(List<T> arr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTheoMa(String ma) {
        int p=getViTri(ma);
        if(p==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println(a.get(p));
        }
    }
    

    @Override
    public List<Sach> timTheoTenSach(String key) {
        List<Sach> b=new ArrayList<>();
        a.forEach(t->{
            if(t instanceof Sach &&((Sach)t).getTenSach().toLowerCase().contains(key.toLowerCase())){
                b.add((Sach) t);
            }
            
        });
        
        return b;
    }

    @Override
    public List<TaiLieu> timTheoTuDen(int from, int to) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xoaMa(String ma) {
        int p=getViTri(ma);
        if(p==-1){
            System.out.println("Not Found");
        }
        else{
            a.remove(p);
            System.out.println("Xoa thanh cong");
        }    
    }

    @Override
    public void xoaNhieu(String tacGia) {
        List<TaiLieu> b=new ArrayList<>();
        for(TaiLieu t: a){
            if(t instanceof Sach &&((Sach)t).getTenTG().toLowerCase().contains(tacGia.toLowerCase())){
                continue;
            }
            else{
                b.add((Sach) t);
            }
        }
        a=b;
    }

    @Override
    public void suaCha(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void suaCon(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}