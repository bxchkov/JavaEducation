package lr2.eclipse;

import java.util.Scanner;

public class task1 extends lesson1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number that is divisible by 3 without remainder");
        
        boolean isInt = false;
        while (!isInt) {
        	String line = in.next();
        	try {
        		int num = Integer.parseInt(line);
        		isInt = true;
        		if (num % 3 == 0) {
        			System.out.println("Number " + num + " is successfully divisible by 3 without remainder");
        		} else {
        			System.out.println("Number " + num + " isn't divisible by 3 without remainder");
        		}
        	} catch (NumberFormatException exception){
        		System.out.println("It isn't number, try again:");
        	}
        }
        in.close();
	}

}
