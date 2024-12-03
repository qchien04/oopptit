/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnBaToCom;

import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import model.Product;

public class AnBaToCom {
    public static void main(String[] args) {
        //fomat chuoi
//        int stt=1;
//        String ma = String.format("MH%02d", stt);

        double number = 3.14159265359;
        System.out.printf("%.2f%n", number); // Output: 3.14
        String formattedNumber = String.format("%.2f", number);
        System.out.println(formattedNumber); // Output: 3.14
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(number)); // Output: 3.14
        
        
        //format ngay
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        
        
        String dateString = "17/08/2024";
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formatter2.parse(dateString);
            System.out.println(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int x=0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (x == 2|| x==5|| x==0||x==7) {
                iterator.remove(); // Xóa phần tử có giá trị 2
            }
            x++;
        }
        for(int i: list){
            System.out.println(i);
        }
        
        
        //duyet map
//                    for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
//                System.out.println(entry.getKey()+" "+entry.getValue());
//            }
//            mp.forEach((key, value) -> {
//                System.out.println("Key: " + key + ", Value: " + value);
//            });        
//            for (Integer key : mp.keySet()) {
//                System.out.println("Key: " + key + ", Value: " + mp.get(key));
//            }


        //sort
        
//        Collections.sort(a,new Comparator<Product>(){
//                @Override
//                public int compare(Product a,Product b){
//                    return Double.compare(b.getGiaban()-b.getGiamua(), a.getGiaban()-a.getGiamua());
//                    
//                }
//            });




    }
}