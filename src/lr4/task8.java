package lr4;

import java.util.Random;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = in.nextLine();
        char[] textChars = text.toCharArray();
        boolean hasError = true;
        int key = 0;
        while (hasError){
            try{
                System.out.println("Введите ключ:");
                key = Integer.parseInt(in.nextLine());
                if(key == 0) {
                    System.out.println("Это бессмысленно");
                    continue;
                }
                hasError = false;
            }
            catch(Exception ignored){}
        }
        for (int i = 0; i < textChars.length; i++){
            System.out.print((char) ++textChars[i]);
        }
        System.out.println();
        System.out.println("Выполнить обратное преобразование? (y/n)");
        hasError = true;
        while (hasError) {
            switch (in.nextLine()) {
                case "y" -> {
                    System.out.println(text);
                    hasError = false;
                }
                case "n" -> {
                    System.out.println("До свидания!");
                    hasError = false;
                }
                default -> {
                    System.out.println("Введите корректный ответ");
                }
            }
        }
    }
}
