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
public class tichhaidoituongmatran {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
class Matrix{
    private int n,m;
    private int[][] a;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a=new int[n][m];
    }
    public void nextMatrix(Scanner sc){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    public Matrix mul(Matrix b){
        Matrix ans=new Matrix(n, b.m);
        for(int i=0;i<n;i++){
            for(int j=0;j<b.m;j++){
                for(int k=0;k<m;k++){
                    ans.a[i][j]+=a[i][k]*b.a[k][j];
                }
                    
            }
        }
        return ans;
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                s+=a[i][j]+" ";
            }
            s+="\n";
        }
        return s;
    }
    
}