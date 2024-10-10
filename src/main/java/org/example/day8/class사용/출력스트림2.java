package org.example.day8.class사용;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class 출력스트림2 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("c:/data/imsi2.txt");
            byte[] array = {10, 20, 30, 40, 50};

            os.write(array, 0, 3);

            os.flush();
            os.close();
        }catch (Exception e) {
            e.printStackTrace(); //자세하게 프린트
        }
    }
}
