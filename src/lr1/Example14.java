package lr1;

import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int num = in.nextInt();
        int numM = num-1;
        int numP = num+1;
        int nums = (num + numM + numP);
        int numsSq = (nums*nums);

        //System.out.println((num-1) + ", " + num + ", " + (num+1) + ", " + (((num-1)+num+(num+1))*((num-1)+num+(num+1))));
        System.out.println(numM + ", " + num + ", " + numP + ", " + numsSq);
        in.close();
    }
}