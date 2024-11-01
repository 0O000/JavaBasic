package org.example.codingTest.programmers;

public class PCCE_10 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int count = 0;
        for(int i = 0; i < data.length; i++){
            if(ext.equals("code") && data[i][0] <= val_ext){
                count++;
            }
            if(ext.equals("date") && data[i][1] <= val_ext){
                count++;
            }
        }
        int[][] answer = new int[count][4];
        int index = 0;
        for(int i = 0; i < data.length; i++){
            if(ext.equals("code") && data[i][0] <= val_ext){
                answer[index] = data[i];
                index++;
            }
            if(ext.equals("date") && data[i][1] <= val_ext){
                answer[index] = data[i];
                index++;
            }
        }
        for(int i = 0; i < answer.length; i++){
            if(sort_by.equals("maximum")){
                answer = sb(2, answer);
            }
            if(sort_by.equals("remain")){
                answer = sb(3, answer);
            }
        }
        return answer;
    }

    public int[][] sb(int sort_by, int[][] arr){
        int[][] sb = new int[arr.length][4];
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i][sort_by] > arr[j][sort_by]){
                    sb[i] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = sb[i];
                }
            }
        }
        return arr;
    }
}