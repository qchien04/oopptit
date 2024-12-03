package AnBaToCom;

import java.util.*;

public class test {
    
    public static void main(String[] args) {
        SinhVien s=new SinhVien();
        s.input();
        s.setDiem(4, 8);
        s.output();
        System.out.println(s.getHoVaTen()+" "+s.getXepLoai());
    }

}
class SinhVien{
    public static Scanner sc=new Scanner(System.in);
    private String maSV,hoVaDem,ten;
    private int tuoi;
    private String gioitinh;
    private double d1,d2;

    public SinhVien() {
    }

    public void input(){
        while(true){
            String c=sc.nextLine();
            if(!c.matches("\\d+")){
                System.out.println("nhap sai");
            }
            else{
                this.maSV="B22DCCN"+c;
                break;
            }
        }
        this.hoVaDem=sc.nextLine();
        this.ten=sc.nextLine();
        while(true){
            int t=Integer.parseInt(sc.nextLine());
            if(t<18||t>23){
                System.out.println("nhap sai");
            }
            else break;
        }
        
        String gg=sc.nextLine();
        String g=gg.toLowerCase();
        if(g.equals("true")){
            this.gioitinh="nam";
        }
        else this.gioitinh="nu";
        while(true){
            System.out.println("nhap diem");
            double d=Double.parseDouble(sc.nextLine());
            if(d>10){
                System.out.println("nhap sai");
            }
            else {
                this.d1=d;
                break;
            }
        }
        while(true){
            System.out.println("nhap diem");
            double d=Double.parseDouble(sc.nextLine());
            if(d>10){
                System.out.println("nhap sai");
            }
            else {
                this.d2=d;
                break;
            }
        }
        
    }
    public String getHoVaTen(){
        return this.hoVaDem+" "+this.ten;
    }
    public double getGPA(){
        double a=(this.d1+this.d2*2)/3;
        return a;
    }
    
    public void setDiem(double a,double b){
        this.d1=a;
        this.d2=b;
    }
    public String getXepLoai(){
        double a=getGPA();
        if(a<5) return "yeu";
        if(a<6.5) return "trung binh";
        if(a<8) return "kha";
        if(a<8) return "gioi";
        return "xuat sac";
    }
    public void output() {
        System.out.println(this.maSV+" "+
                this.hoVaDem+" "+this.ten+" "+this.gioitinh+" "+String.format("%.1f",getGPA())+" "+getXepLoai());
    }
            
    
}

