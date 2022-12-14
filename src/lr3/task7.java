package lr3;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        int aLength = 10; // Мин/Макс знач. - 0/13
        char[] Alphabet = new char[aLength];
        char[] iAlphabet = new char[aLength];
        char a = 'a';
        for(int i = 0; i < aLength; i++) {
            Alphabet[i] = a;
            iAlphabet[(aLength-1)-i] = a;
            //System.out.println(a);
            a+=2; // начиная с "а": 1 - не пропуская буквы, 2 - через одну, ... , n - через n-1
        }
        System.out.println("Финальный алфавит - " + Arrays.toString(Alphabet));
        System.out.println("Финальный реверсивный алфавит - " + Arrays.toString(iAlphabet));
    }
}
