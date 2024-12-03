/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;

/**
 *
 * @author chien
 */
public class bondiemtrenmatphang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}


class Point3D {
    private int x;
    private int y;
    private int z;
    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public static boolean check(Point3D a,Point3D b,Point3D c,Point3D d){
        int ab0=b.x-a.x;
        int ab1=b.y-a.y;
        int ab2=b.z-a.z;
        int ac0=c.x-a.x;
        int ac1=c.y-a.y;
        int ac2=c.z-a.z;
        int ad0=d.x-a.x;
        int ad1=d.y-a.y;
        int ad2=d.z-a.z;
        
        int tch0=ab1*ac2-ab2*ac1;
        int tch1=ab2*ac0-ab0*ac2;
        int tch2=ab2*ac0-ab0*ac2;
        int ans=tch0*ad0+tch1*ad1+tch2*ad2;
        return ans==0;
        
    }
    
}