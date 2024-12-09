/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvien1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author chien
 */
public class ghi_list_vao_file {
    public static void main(String[] args) throws ParseException {
        // Tạo một ArrayList và thêm các phần tử vào
        ArrayList<String> list = new ArrayList<>();
        list.add("Jhsf00dklT12uhf780LPPZH");
        list.add("AAAAddd0000000000000000001T");
        
        String fileName = "DATA2.in";
        
//        
//        ArrayList<SinhVien> arr=new ArrayList<>();
//        danhsachsinhvien1.SinhVien a=new SinhVien(12,"chien", "d22", "11/1/1100", 3);
//        arr.add(a);
//        
        
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(101);
        list2.add(131);
        list2.add(131);
         list2.add(101);
        list2.add(2);
        list2.add(1);
        list2.add(131);
         list2.add(1);
        list2.add(2);
        list2.add(11);
        list2.add(131);
         list2.add(1);
        list2.add(2);
        list2.add(11);
        list2.add(11);
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            
            out.writeObject(list2);
            System.out.println("ArrayList đã được ghi vào file " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//class SinhVien implements Serializable{
//    private static SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyy");
//    private String id,name,lop;
//    private Date ns;
//    private double gpa;
//
//    public SinhVien(int id,String name, String lop, String ns, double gpa) throws ParseException {
//        this.id=String.format("B20DCCN%03d", ++id);
//        this.name = name;
//        this.lop = lop;
//        if(ns.charAt(1)=='/'){
//            ns="0"+ns;
//        }
//        if(ns.charAt(4)=='/'){
//            ns=ns.substring(0,3)+"0"+ns.substring(3);
//        }
//        this.ns = df.parse(ns);
//        this.gpa = gpa;
//    }
//
//    @Override
//    public String toString() {
//        return id+" "+name+" "+lop+" "+df.format(ns)+" "+String.format("%.2f", gpa);
//    }
//    
//    
//}