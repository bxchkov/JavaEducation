package lr6.task7;

public class task7 {
    char[] ch1;
    int[] textCode(char[] ch1) {
        int[] charCode = new int[ch1.length];
        for (int i = 0; i < ch1.length - 1; i++) {
            charCode[i] = (int) ch1[i];
        }
        return charCode;
    }
}
