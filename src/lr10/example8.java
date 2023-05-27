package lr10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class example8 {

    public static void main(String[] args) throws IOException {
        //Открываем файл Excel
        String filePath = "src/lr10/example.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        //Создаем экземпляр книги excel из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        //Получить лист по имени
        XSSFSheet sheet = workbook.getSheet("Товары");

        //Перебирем строки и ячейки листа
        for (Row row : sheet){
            for (Cell cell : row)
                System.out.println(cell.toString() + "\t");
            System.out.println();
        }
        //Закрыть файл и очистить ресурсы
        workbook.close();
        inputStream.close();
    }

}
