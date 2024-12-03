package J07053_XetTuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ThiSinh {
    private String id;
    private String name;
    private int tuoi;
    private String dateOfBirth;
    private double theory;
    private double practice;
    private static int cnt = 1;
    private int diem;
    private double diemCong;
    private String xepLoai;


    public ThiSinh(String name, String dateOfBirth, double theory, double practice) throws ParseException {

            this.id = String.format("PH%02d", cnt++);
            this.name = chuanHoa1(name);
            SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
            this.dateOfBirth = date2.format(date2.parse(dateOfBirth));
            this.theory = theory;
            this.practice = practice;
            if(this.theory >= 8 && this.practice >= 8 ){
                    this.diemCong = 1;
            }
            else if(this.theory >= 7.5 && this.practice >= 7.5) {
                    this.diemCong = 0.5;
            }
            else {
                    this.diemCong = 0;
            }
            this.diem = (int)(Math.round((this.practice + this.theory) / 2 + this.diemCong));
            if(this.diem > 10) {
                    this.diem = 10;
            }

            this.tuoi = 2021 - Integer.parseInt(this.dateOfBirth.split("/")[2]);

            this.xepLoai = chuanHoa2(this.diem);

    }

    @Override
    public String toString() {
            return id + " " + name + " " + tuoi + " " + diem + " " + xepLoai;

    }

    public String chuanHoa1(String name) {
            String result = "";
            String[] s = name.trim().split("\\s+");
            for(String x : s) {
                    result += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
            }
            return result.trim();
    }

    public String chuanHoa2(int diem) {
            if(diem >= 9) return "Xuat sac";
            else if(diem == 8) return "Gioi";
            else if(diem == 7) return "Kha";
            else if(diem >= 5) return "Trung binh";
            else return "Truot";
    }
}
