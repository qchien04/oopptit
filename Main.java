
import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chien
 */
public class Main {
    public static void main(String[] args) {
        String s="   anh oi lau dai tinh ai do    ";
        
        String[] res=s.split("\\s+");
        int cnt=0;
        for(String i:res){
            System.out.println((cnt++)+":"+i+":");
        }
    }
}
