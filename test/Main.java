package Bai27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		int test = Integer.parseInt(sc.nextLine());
		ArrayList<MonHoc> arr = new ArrayList<>();
		
		while(test-- > 0) {
			String[] s = sc.nextLine().trim().split("\\s+");
			String maMon = s[0];
			String tenMon = s[1];
			MonHoc mh = new MonHoc(maMon, tenMon);
			arr.add(mh);
		}
		
		sc.close();
		
		Scanner sc1 = new Scanner(new File("GIANGVIEN.in"));
		int test1 = Integer.parseInt(sc1.nextLine());
		ArrayList<GiangVien> arr1 = new ArrayList<>();
		
		while(test1-- > 0) {
			String[] s = sc1.nextLine().trim().split("\\s+");
			String maGV = s[0];
			String tenGV = "";
			
			for(int i = 1; i < s.length; i++){
				tenGV += s[i] + " ";
			}
			tenGV = tenGV.trim();
			GiangVien gv = new GiangVien(maGV, tenGV);
			arr1.add(gv);
			
		}
		
		sc1.close();
		Scanner sc2 = new Scanner(new File("GIOCHUAN.in"));
		int test2 = Integer.parseInt(sc2.nextLine());
		
		for(int i = 0; i < test2; i++) {
			String[] s = sc2.nextLine().trim().split("\\s+");
			String maGV = s[0];
			double gio = Double.parseDouble(s[2]);
                        for(GiangVien j:arr1){
                            if(j.getMaGV().equals(maGV)){
                                j.congGc(gio);
                            }
                        }
		}
		
		for(GiangVien gv : arr1) {
			System.out.println(gv);
		}
		
	}
}
