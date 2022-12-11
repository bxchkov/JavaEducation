package lr2.eclipse;

import java.util.Scanner;

public class task2 extends lesson1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number in which when dividing by 5 the remainder will be 2, and when dividing by 7 the remainder will be 1");
        
        boolean isInt = false;
        while (!isInt) {
        	String line = in.next();
        	try {
        		int num = Integer.parseInt(line);
        		isInt = true;
        		if ((num % 5 == 2) && (num % 7 == 1)) {
        			System.out.println("Success!");
        		} else {
        			System.out.println("The number " + num + " doesn't meet the specified requirements");
        		}
        	} catch (NumberFormatException exception){
        		System.out.println("It isn't number, try again:");
        	}
        }
        in.close();
	}

}
