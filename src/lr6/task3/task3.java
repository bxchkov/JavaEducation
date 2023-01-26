package lr6.task3;

public class task3 {
    public static int Max, Min;
    public static double Average;
    public static int[] Array = {5, 8, 34, 48, 2};

    static public void Method1()
    {
        int sum = 0;
        Max = Array[0];
        Min = Array[0];
        for (int j : Array) {
            sum += j;
            if (j > Max) Max = j;
            if (j < Min) Min = j;
        }
        Average = (double) sum / Array.length;
    }
}