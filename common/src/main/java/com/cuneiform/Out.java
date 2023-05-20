package com.cuneiform;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Out {
    public static void writeToFile(String out, String filePath) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)));
            // if (!filePath.exists()) filePath.createNewFile();
            
            bw.write(out);
            bw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
