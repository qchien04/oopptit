/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author chien
 */
public class lietkecapso {
    public static int ntcn(int a,int b){
        if(b!=0){
            return ntcn(b,a%b);
        }
        return a;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream is=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> arr=(ArrayList<Pair>) is.readObject();
        ArrayList<Pair> arr2=new ArrayList<>();
        for(Pair i:arr){
            if(i.getFirst()<i.getSecond()&& ntcn(i.getFirst(),i.getSecond())==1){
                arr2.add(i);
            }
        }

        Collections.sort(arr2);
        if(arr2.size()>1){
            System.out.println(arr2.get(0));
            for(int i=1;i<arr2.size();i++){
                if(arr2.get(i).getFirst()==arr2.get(i-1).getFirst() &&
                        arr2.get(i).getSecond()==arr2.get(i-1).getSecond()){
                            continue;
                    }
                else{
                    System.out.println(arr2.get(i));
                }
            }
        }else{
            System.out.println(arr2.get(0));
        }
       

        





//    ObjectOutputStream is=new ObjectOutputStream(new FileOutputStream("DATA.in"));
//        Pair p=new Pair(0, 1);
//        ArrayList<Pair> arr=new ArrayList<>();
//        arr.add(p);
//        is.writeObject(arr);
//        System.out.println("ghi ok");
        
    }
}
