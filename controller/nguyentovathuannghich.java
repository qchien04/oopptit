/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
public class nguyentovathuannghich {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream is1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream is2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> arr1=(ArrayList<Integer>) is1.readObject();
        ArrayList<Integer> arr2=(ArrayList<Integer>) is2.readObject();
        int[] nt=new int[930];
        int[] a=new int[930];
        int[] b=new int[930];
        nt[2]=1;
        nt[3]=1;
        nt[5]=1;
        nt[7]=1;
        nt[11]=1;
        nt[101]=1;
        nt[131]=1;
        nt[151]=1;
        nt[181]=1;
        nt[191]=1;nt[313]=1;
        nt[353]=1;nt[373]=1;
        nt[383]=1;nt[727]=1;
        nt[757]=1;
        nt[787]=1;nt[797]=1;
        nt[919]=1;nt[929]=1;

        for(int i:arr1){
            if(i<930&&nt[i]==1){
                a[i]++;
            }
        }
        for(int i:arr2){
            if(i<930&&nt[i]==1){
                b[i]++;
            }
        }
        int[] arr={2,3,5,7,11,101,131,151,181,191,313,353,373,383,727,
                    757,787,797,919,929};
        for(int i=0;i<20;i++){
            if(a[arr[i]]>0&&b[arr[i]]>0){
                System.out.println(arr[i]+" "+a[arr[i]]+" "+b[arr[i]]);
            }
        }
        
    }
}
