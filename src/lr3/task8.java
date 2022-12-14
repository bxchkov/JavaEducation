package lr3;

import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        int aLength = 2; // Мин/Макс знач. - 0/10
        char[] Alphabet = new char[aLength];
        char[] iAlphabet = new char[aLength];
        char a = 'A';
        for(int i = 0; i < aLength;) {
            System.out.println(a);
            if(!(a == 'A' || a == 'E' || a == 'I')) {
                Alphabet[i] = a;
                iAlphabet[(aLength-1)-i] = a;
                i++;
            }
            a++;
        }
        System.out.println("Финальный алфавит согласных- " + Arrays.toString(Alphabet));
        System.out.println("Финальный реверсивный алфавит согласных - " + Arrays.toString(iAlphabet));
    }
}
