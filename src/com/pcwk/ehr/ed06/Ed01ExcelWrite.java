/**
 * 파일명:Ed01ExcelWrite.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed06;

import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ed01ExcelWrite {
	public static void main(String[] args) {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("학생정보");

		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("이름");
		header.createCell(1).setCellValue("나이");
		header.createCell(2).setCellValue("학년");

		// 데이터 추가
		Row row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("홍길동");
		row1.createCell(1).setCellValue(20);
		row1.createCell(2).setCellValue(2);
		try (FileOutputStream fos = new FileOutputStream("students.xlsx")) {
			workbook.write(fos);
			workbook.close();
			System.out.println("Excel 파일 생성 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
