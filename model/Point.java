/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class Point {
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
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}
