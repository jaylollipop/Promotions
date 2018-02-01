package com.company;

import java.io.*;
import java.lang.String;
import java.io.File;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Main {

    public static void main(String[] args) {

        String path = "promotion1.log";
        File file = new File(path);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line[] ;
            // .useDelimiter("\\s*|\\s*");
            while ((line = br.readLine()) != null) {
               // System.out.println(line);

                JSONObject obj = new JSONObject();
// นำข้อมูลเข้ามา
                int i ;
                for(i = 0 ; i <= line.length  ; i = i+1 ) {
                    obj.put("Data", line[i]);
                    obj.put("TimeS", line[i]);
                    obj.put("TimeN", line[i]);
                    obj.put("PhoneNumber", line[i]);
                }


                try(FileWriter files = new FileWriter("Promotion.json")){
                    files.write(obj.toString());
                    files.flush();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

