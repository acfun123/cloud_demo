import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

/**
 * @author niecong
 * @date 2022/11/12 20:35
 */
@SpringBootTest()
public class ExcelPoiTest {
    @Test
    public void test1() throws IOException, InvalidFormatException {
        System.out.println("sdfjak");
        String filename = "E:\\Desktop\\新建文本.xlsx";
        String filename2 = "E:\\Desktop\\新建文本2.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(filename));
        XSSFSheet sheet = workbook.getSheet("sheet1");
        CellRangeAddress cellAddresses = new CellRangeAddress(0, 1, 0, 1);
        sheet.addMergedRegion(cellAddresses);

        XSSFCellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setBorderBottom(BorderStyle.DOUBLE);
        cellStyle.setBorderLeft(BorderStyle.DOUBLE);
        cellStyle.setBorderRight(BorderStyle.DOUBLE);
        cellStyle.setBorderTop(BorderStyle.DOUBLE);

        XSSFRow row = sheet.createRow(2);
        XSSFCell cell1 = row.createCell(1);
        XSSFCell cell2 = row.createCell(2);
        XSSFCell cell3 = row.createCell(3);
        XSSFCell cell4 = row.createCell(4);
        XSSFCell cell5 = row.createCell(5);


        cell1.setCellValue("askdfj");
        cell2.setCellValue("askdfj");
        cell3.setCellValue("askdfj");
        cell4.setCellValue("askdfj");
        cell5.setCellValue("askdfj");

        cell1.setCellStyle(cellStyle);
        cell2.setCellStyle(cellStyle);
        cell3.setCellStyle(cellStyle);
        cell4.setCellStyle(cellStyle);
        cell5.setCellStyle(cellStyle);
        workbook.write(new FileOutputStream(filename2));
    }

    @Test
    public void test2(){
        String filename = "E:\\Desktop\\新建文本.xlsx";
        String filename2 = "E:\\Desktop\\新建文本3.xlsx";


    }
}
