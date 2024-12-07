/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltap;

/**
 *
 * @author chien
 */
import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String a = sc.next(); 
        int d = 0, x = 0, t = 0; 
        for (int i = 0; i < n; i++) {
            char color = a.charAt(i);
            if (color == 'T') t++;
            if (color == 'X') x++;
            if (color == 'D') d++;
        }
        int dem = 0;
        int dem1 = 0;   
        int dem2 = 0;   
        
        for (int i = 0; i < x; i++) {
            if (a.charAt(i) != 'X') dem++;
            if (a.charAt(i) == 'D') dem1++;
        }
        
        for (int i = n - d; i < n; i++) {
            if (a.charAt(i) != 'D') dem++;
            if (a.charAt(i) == 'X') dem2++;
        }
        System.out.println(dem - Math.min(dem1, dem2));
        
    }
}