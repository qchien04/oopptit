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
public class lop_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
class Triangle{
    private Point p1,p2,p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public boolean valid(){
        double a=Point.distance(p1, p2);
        double b=Point.distance(p1, p3);
        double c=Point.distance(p3, p2);
        if(a+b<=c||a+c<=b||c+b<=a){
            return false;
        }
        return true;
    }
    public String getPerimeter(){
        double a=Point.distance(p1, p2);
        double b=Point.distance(p1, p3);
        double c=Point.distance(p3, p2);
        return String.format("%.3f", a+b+c);
    }
    
}

class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distance(Point secondPoint){
        double ans=Math.sqrt((secondPoint.x-this.x)*(secondPoint.x-this.x)+(secondPoint.y-this.y)*(secondPoint.y-this.y));
        return ans;
    }
    public static double distance(Point firstPoint,Point secondPoint){
        double ans=Math.sqrt((secondPoint.x-firstPoint.x)*(secondPoint.x-firstPoint.x)+(secondPoint.y-firstPoint.y)*(secondPoint.y-firstPoint.y));
        return ans;
    }
    public boolean equalTo(Point secondPoint){
        return this.x==secondPoint.x&&this.y==secondPoint.y;
    }
    public static Point nextPoint(Scanner sc){
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        return new Point(a, b);
    }
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}