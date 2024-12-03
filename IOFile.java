/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public static <T> List<T> doc(String fname){
        List<T> list=new ArrayList<>();
        try{
            ObjectInputStream f= new ObjectInputStream(new FileInputStream(fname));
            list=(List<T>)f.readObject();
            f.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }
    public static <T> void ghi(String fname,List<T> list){
        try{
            ObjectOutputStream f= new ObjectOutputStream(new FileOutputStream(fname));
            f.writeObject(list);
            f.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

