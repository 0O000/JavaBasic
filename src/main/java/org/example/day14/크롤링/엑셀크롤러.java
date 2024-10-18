package org.example.day14.크롤링;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class 엑셀크롤러 {
    public static void main(String[] args) {
        // 워크북 생성 (XSSFWorkbook은 .xlsx 파일 형식을 지원)
        Workbook workbook = new XSSFWorkbook();

        // 시트 생성
        Sheet sheet = workbook.createSheet("Sample Sheet");

        // 행(row) 생성
        Row row = sheet.createRow(0);

        // 셀(cell) 생성 및 데이터 입력
        Cell cell1 = row.createCell(0);
        cell1.setCellValue("Hello");

        Cell cell2 = row.createCell(1);
        cell2.setCellValue("Excel");

        Cell cell3 = row.createCell(2);
        cell3.setCellValue(12345);

        // 파일에 쓰기
        try (FileOutputStream fileOut = new FileOutputStream("example.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 워크북 종료 (메모리에서 해제)
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
