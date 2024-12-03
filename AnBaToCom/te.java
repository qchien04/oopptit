/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author chien
 */
public class te {

    public static void main(String[] args) {
        DuAnCNTT a=new DuAnCNTT();
        Scanner in=new Scanner(System.in);
        a.input(in);
        System.out.println(a);
    }
    
}
interface IDuAn{
    boolean isMa(String ma);
    boolean isSo(String ma);
    double getTongTien();
}
class DuAn{
    protected String ma,ten;
    protected double tongChiPhi;

    public DuAn() {
    }

    public DuAn(String ma, String ten, double tongChiPhi) {
        this.ma = ma;
        this.ten = ten;
        this.tongChiPhi = tongChiPhi;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }


    public double getTongChiPhi() {
        return tongChiPhi;
    }

    public void setTongChiPhi(double tongChiPhi) {
        this.tongChiPhi = tongChiPhi;
    }
    
}

class DuAnCNTT extends DuAn implements IDuAn{
    private String loaiDuAn;
    private int soThangBaoTri;

    public DuAnCNTT() {
    }

    public DuAnCNTT(String ma, String ten,String loaiDuAn, int soThangBaoTri,double tongChiPhi) {
        super(ma, ten, tongChiPhi);
        this.loaiDuAn = loaiDuAn;
        this.soThangBaoTri = soThangBaoTri;
    }

    @Override
    public boolean isMa(String ma) {
        String btcp="^it\\d{4}-\\d{2}$";
        return ma.matches(btcp);
    }

    @Override
    public boolean isSo(String ma) {
        return ma.matches("\\d+");    
    }

    @Override
    public double getTongTien() {
        if(soThangBaoTri>=5){
            return tongChiPhi*110/100;
        }
        return tongChiPhi;
    }

    public String getLoaiDuAn() {
        return loaiDuAn;
    }

    public void setLoaiDuAn(String loaiDuAn) {
        this.loaiDuAn = loaiDuAn;
    }

    public int getSoThangBaoTri() {
        return soThangBaoTri;
    }

    public void setSoThangBaoTri(int soThangBaoTri) {
        this.soThangBaoTri = soThangBaoTri;
    }
    public void input(Scanner sc){
        while(true){
            String tmp=sc.nextLine();
            if(isMa(tmp)){
                this.ma=tmp;
                break;
            }
            else{
                System.out.println("nhap sai");
            }
        }
        this.ten=sc.nextLine();
        this.tongChiPhi=Integer.parseInt(sc.nextLine());
        while(true){
            String tmp=sc.nextLine();
            if(isSo(tmp)){
                this.soThangBaoTri=Integer.parseInt(tmp);
                break;
            }
            else{
                System.out.println("nhap sai");
            }
        }
        this.loaiDuAn=sc.nextLine();
    }
    @Override
    public String toString() {
        return ma+" "+ten+" "+loaiDuAn+" "+soThangBaoTri+"\t"+getTongTien();
    }
    
}