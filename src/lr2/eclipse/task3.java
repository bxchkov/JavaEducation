package lr2.eclipse;

import java.util.Scanner;

public class task3 extends lesson1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number that is divisible by 4 and greater than 10");
        
        boolean isInt = false;
        while (!isInt) {
        	String line = in.next();
        	try {
        		int num = Integer.parseInt(line);
        		isInt = true;
        		if ((num % 4 == 0) && !(num < 10)) {
        			System.out.println("Success!");
        		} else {
        			System.out.println("The number " + num + " doesn't meet the specified requirements!");
        		}
        	} catch (NumberFormatException exception){
        		System.out.println("It isn't number, try again:");
        	}
        }
        in.close();
	}

}
