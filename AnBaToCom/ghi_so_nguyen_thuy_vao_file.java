/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvien1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author chien
 */
public class ghi_so_nguyen_thuy_vao_file {
    public static void main(String[] args) {
        // Đường dẫn đến file bạn muốn ghi
        String filePath = "DATA.in";

        // Ghi số nguyên vào file nhị phân
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
//            dos.writeInt(1);
//            dos.writeInt(4);
//            dos.writeInt(4);
//            dos.writeInt(4);
//            dos.writeInt(1);
//            dos.writeBytes("Jhsf00dklT12uhf780LPPZH");
            
//            System.out.println("Số nguyên đã được ghi vào file.");
                
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
