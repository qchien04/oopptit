///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.util.Scanner;
//
//public class chu_vi_tam_giac {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-- >0){
//            try {
//                double x1=sc.nextDouble();
//                double y1=sc.nextDouble();
//                double x2=sc.nextDouble();
//                double y2=sc.nextDouble();
//                double x3=sc.nextDouble();
//                double y3=sc.nextDouble();
//                
//                Point x=new Point(x1,y1);
//                Point y=new Point(x2,y2);
//                Point z=new Point(x3,y3);
//                
//                double r1=Point.distance(x, y);
//                double r2=Point.distance(z, y);
//                double r3=Point.distance(x, z);
//                
//                if((r1+r2<=r3)||(r1+r3<=r2)||(r3+r2<=r1)){
//                    throw new Exception();
//                }
//                System.out.println(String.format("%.3f", r1+r2+r3));
//            } catch (Exception e) {
//                System.out.println("INVALID");
//            }
//            
//        }
//    }
//}
//class Point {
//    private double x;
//    private double y;
//
//    public Point() {
//    }
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//    public Point(Point p) {
//        this.x = p.x;
//        this.y = p.y;
//    }
//    public double getX() {
//        return x;
//    }
//
//    public void setX(double x) {
//        this.x = x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public void setY(double y) {
//        this.y = y;
//    }
//    
//    public double distance(Point secondPoint){
//        double ans=Math.sqrt((secondPoint.x-this.x)*(secondPoint.x-this.x)+(secondPoint.y-this.y)*(secondPoint.y-this.y));
//        return ans;
//    }
//    public static double distance(Point firstPoint,Point secondPoint){
//        double ans=Math.sqrt((secondPoint.x-firstPoint.x)*(secondPoint.x-firstPoint.x)+(secondPoint.y-firstPoint.y)*(secondPoint.y-firstPoint.y));
//        return ans;
//    }
//    public boolean equalTo(Point secondPoint){
//        return this.x==secondPoint.x&&this.y==secondPoint.y;
//    }
//
//    @Override
//    public String toString() {
//        return "Point{" + "x=" + x + ", y=" + y + '}';
//    }
//    
//}
