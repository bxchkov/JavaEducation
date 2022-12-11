package lr2.eclipse;

import java.util.Scanner;

public class task5 extends lesson1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input number (>= 1000):");
        boolean isInt = false;
        while (!isInt) {
        	String line = in.next();
        	try {
        		int num = Integer.parseInt(line);
        		isInt = true;
        		num = (num / 1000) % 10;
        		System.out.println(num);
        	} catch (NumberFormatException exception){
        		System.out.println("It isn't number, try again:");
        	}
        }
        in.close();
	}

}
