package org.example.day8.class사용;

import java.io.File;
import java.util.Arrays;

public class 파일다루기 {
    public static void main(String[] args) {
        File file = new File("C:\\jdk-17\\bin");
        // C:/jdk-17/bin
        // C:\\jdk-17\\bin
        System.out.println(file.exists());
        System.out.println(file.isFile());
        // 디렉토리 == 폴더 == 패키지
        System.out.println(file.isDirectory());
        File[] list = file.listFiles();
        System.out.println(list.length);
        for(File f : list){
            //확장자가 exe인 경우만 프린트!
            String name = f.getName();
            if(name.endsWith(".exe")){
                System.out.println(f);
            }
        }
    }
}