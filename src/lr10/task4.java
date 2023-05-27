package lr10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class task4 {

    public static void main(String[] args) throws IOException {
        String filePath = "src/lr10/example.xlsx";

        // Открываем файл Excel для чтения
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
        } catch (IOException e) {
            System.err.println("Не удалось открыть файл Excel: " + e.getMessage());
            return;
        }

        //Открываем файл Excel
        FileInputStream inputStream1 = new FileInputStream(filePath);

        // Создаем экземпляр книги excel из файла
        XSSFWorkbook workbook1 = new XSSFWorkbook(inputStream1);

        // Получить лист по имени
        try {
            XSSFSheet sheet1 = workbook1.getSheet("Товары");

            // Перебирем строки и ячейки листа
            for (Row row : sheet1) {
                for (Cell cell : row) {
                    System.out.println(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (NullPointerException e){
            System.err.println("Листа с таким названием не найдено");
        }
        // Закрыть файл и очистить ресурсы
        workbook1.close();
        inputStream1.close();
    }

}
