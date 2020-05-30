package xlsreadwritedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import xlsreadwritedemo.bean.StudentDetail;

public class ReadExcelFileDemo {
	public static void main(String args[]) throws IOException {
		// obtaining input bytes from a file
		FileInputStream fis = new FileInputStream(new File(
				"D:\\downloaded\\xlsjars\\readxlsdmo.xls"));
		FileOutputStream fos = new FileOutputStream(new File(
				"D:\\downloaded\\xlsjars\\writexlsdmo.xls"));
		// creating workbook instance that refers to .xls file
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFWorkbook wbWrite = new HSSFWorkbook();
		// creating a Sheet object to retrieve the object
		HSSFSheet sheet = wb.getSheetAt(0);

		HSSFSheet mechSheet = wbWrite.createSheet("Mechanical Marks");
		String cellID = "Student ID";
		String cellName = "Student Name";
		String subjectComment = "Comment";
		String commentVal = "You Failed";

		Row mechRow = mechSheet.createRow(0);
		Cell mechId = mechRow.createCell(0);
		mechId.setCellValue(cellID);
		Cell mechName = mechRow.createCell(1);
		mechName.setCellValue(cellName);
		Cell subjectMech = mechRow.createCell(2);
		subjectMech.setCellValue("Mechanical Marks");
		Cell mechComment = mechRow.createCell(3);
		mechComment.setCellValue(subjectComment);

		HSSFSheet civilSheet = wbWrite.createSheet("Civil Marks");
		Row civilRow = civilSheet.createRow(0);
		Cell civilId = civilRow.createCell(0);
		civilId.setCellValue(cellID);
		Cell civilName = civilRow.createCell(1);
		civilName.setCellValue(cellName);
		Cell subjectCivil = civilRow.createCell(2);
		subjectCivil.setCellValue("Civil Marks");
		Cell civilComment = mechRow.createCell(3);
		civilComment.setCellValue(subjectComment);

		HSSFSheet electSheet = wbWrite.createSheet("Electrical Marks");
		Row electRow = electSheet.createRow(0);
		Cell electId = electRow.createCell(0);
		electId.setCellValue(cellID);
		Cell electName = electRow.createCell(1);
		electName.setCellValue(cellName);
		Cell subjectElect = electRow.createCell(2);
		subjectElect.setCellValue("Electrical Marks");
		Cell electComment = electRow.createCell(3);
		electComment.setCellValue(subjectComment);

		HSSFSheet computerSheet = wbWrite.createSheet("Computer Marks");
		Row computeRow = computerSheet.createRow(0);
		Cell computeId = computeRow.createCell(0);
		computeId.setCellValue(cellID);
		Cell computeName = computeRow.createCell(1);
		computeName.setCellValue(cellName);
		Cell subjectComput = computeRow.createCell(2);
		subjectComput.setCellValue("Computer Marks");
		Cell computeComment = computeRow.createCell(3);
		computeComment.setCellValue(subjectComment);

		subjectComment = "";
		int studId, mechMarks, civilMarks, electMarks, computerMarks;
		String studName;
		int firstRow = 0;
		HashSet<StudentDetail> hasSet = new HashSet<StudentDetail>();
		for (Row row : sheet) // iteration over row using for each loop
		{

			if (firstRow == 0) {
				firstRow++;
				continue;
			}

			try {
				studId = (int) row.getCell(0).getNumericCellValue();
				studName = row.getCell(1).getStringCellValue();
				mechMarks = (int) row.getCell(2).getNumericCellValue();
				civilMarks = (int) row.getCell(3).getNumericCellValue();
				electMarks = (int) row.getCell(4).getNumericCellValue();
				computerMarks = (int) row.getCell(5).getNumericCellValue();

				StudentDetail studDtl = new StudentDetail();
				studDtl.setStudId(studId);
				studDtl.setStudName(studName);
				studDtl.setMechMarks(mechMarks);
				studDtl.setElectMarks(electMarks);
				studDtl.setCivilMarks(civilMarks);
				studDtl.setComputerMarks(computerMarks);

				if (hasSet.contains(studDtl)) {
					firstRow++;
					continue;
				}
				hasSet.add(studDtl);
				Row mechRow1 = mechSheet.createRow(firstRow);
				Cell mechId1 = mechRow1.createCell(0);
				mechId1.setCellValue(studId);
				Cell mechName1 = mechRow1.createCell(1);
				mechName1.setCellValue(studName);
				Cell subjectMech1 = mechRow1.createCell(2);
				subjectMech1.setCellValue(mechMarks);
				Cell mechComment1 = mechRow1.createCell(3);
				if (mechMarks == 0) {
					mechComment1.setCellValue(commentVal);
				} else {
					mechComment1.setCellValue(subjectComment);
				}

				Row civilRow1 = civilSheet.createRow(firstRow);
				Cell civilId1 = civilRow1.createCell(0);
				civilId1.setCellValue(studId);
				Cell civilName1 = civilRow1.createCell(1);
				civilName1.setCellValue(studName);
				Cell subjectCivil1 = civilRow1.createCell(2);
				subjectCivil1.setCellValue(civilMarks);
				Cell civilComment1 = civilRow1.createCell(3);
				if (civilMarks == 0) {
					civilComment1.setCellValue(commentVal);
				} else {
					civilComment1.setCellValue(subjectComment);
				}

				Row electRow1 = electSheet.createRow(firstRow);
				Cell electId1 = electRow1.createCell(0);
				electId1.setCellValue(studId);
				Cell electName1 = electRow1.createCell(1);
				electName1.setCellValue(studName);
				Cell subjectElect1 = electRow1.createCell(2);
				subjectElect1.setCellValue(electMarks);
				Cell electComment1 = electRow1.createCell(3);
				if (electMarks == 0) {
					electComment1.setCellValue(commentVal);
				} else {
					electComment1.setCellValue(subjectComment);
				}

				Row computRow1 = computerSheet.createRow(firstRow);
				Cell computId1 = computRow1.createCell(0);
				computId1.setCellValue(studId);
				Cell computName1 = computRow1.createCell(1);
				computName1.setCellValue(studName);
				Cell subjectComput1 = computRow1.createCell(2);
				subjectComput1.setCellValue(computerMarks);
				Cell computComment1 = computRow1.createCell(3);
				if (computerMarks == 0) {
					computComment1.setCellValue(commentVal);
				} else {
					computComment1.setCellValue(subjectComment);
				}

				firstRow++;
			} catch (NullPointerException  | ClassCastException | NumberFormatException | IllegalStateException exc ) {
				System.out.println(exc.getMessage());
				
			}
		}
		System.out.println(hasSet);
		wbWrite.write(fos);
	}
}
