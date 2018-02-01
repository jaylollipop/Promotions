package com.company;

import java.io.*;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Main {

    public static void main(String[] args) {

        String path = "promotion1.log";
        File file = new File(path);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line.useDelimiter("\\s*|\\s*");
            while ((line = br.readLine()) != null) {
                System.out.println(line);

                JSONObject obj = new JSONObject();
// นำข้อมูลเข้ามา
                obj.put("Data", line)
                obj.put("TimeS", line)
                obj.put("TimeN", line)
                obj.put("PhoneNumber", line)
                obj.put("PromotionNumber", line)

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

