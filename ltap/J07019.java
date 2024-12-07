import java.util.*;
import java.io.*;
        
public class J07019 {
    public static class sanPham {
        private String ma,ten;
        private long donGia1, donGia2;
        
        public sanPham(String ma, String ten, long donGia1, long donGia2) {
            this.ma = ma;
            this.ten = ten;
            this.donGia1 = donGia1;
            this.donGia2 = donGia2;
        }

       
        
    }
    public static class donHang {
        private String maDonHang;
        private long soLuong, giamGia, thanhTien,phaiTra;
        private sanPham sp;
        
        donHang(String maDonHang, long soLuong, ArrayList<sanPham> dsSanPham) {
            this.maDonHang = maDonHang;
            this.soLuong = soLuong;
            for(sanPham tmp : dsSanPham) {
                if(tmp.ma.equals(this.maDonHang.substring(0,2))) {
                    this.sp = tmp;
                    if(this.maDonHang.charAt(2)=='1')
                        this.thanhTien = this.soLuong*tmp.donGia1;
                    else this.thanhTien = this.soLuong*tmp.donGia2;
                    
                }
            }
            if(this.soLuong>=150) this.giamGia = this.thanhTien/2;
            else if(this.soLuong>=100) this.giamGia = this.thanhTien*3/10;
            else if(this.soLuong>=50) this.giamGia = this.thanhTien*15/100;
            else this.giamGia =0;
            //phaiTra
            this.phaiTra = this.thanhTien - this.giamGia;
        }
        @Override
        public String toString() {
            return maDonHang + " " + this.sp.ten + " " + String.format("%d %d", this.giamGia, this.phaiTra);
        }
    }
    public static void main(String agrs[]) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        //data1
        int t = sc1.nextInt();
        ArrayList<sanPham> sp = new ArrayList<>();
        while(t-- >0) {
            String ma = sc1.next();
            sc1.nextLine();
            String ten = sc1.nextLine().trim();
            long donGia1 = sc1.nextLong();
            long donGia2 = sc1.nextLong();
            sp.add(new sanPham(ma,ten,donGia1,donGia2));
        }
        //data2
        t = sc2.nextInt();
        ArrayList<donHang> dsDonHang = new ArrayList<>();
        for(int i=1;i<=t;i++) {
            String maDonHang = sc2.next();
            if(i<10) maDonHang+="-00"+i;
            else if(i<100) maDonHang+="-0"+i;
            else maDonHang+="-"+i;
            long soLuong = sc2.nextLong();
            dsDonHang.add(new donHang(maDonHang,soLuong,sp));
        }
        for(donHang tmp : dsDonHang)
            System.out.println(tmp);
    }
}
