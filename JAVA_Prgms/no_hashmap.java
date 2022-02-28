package pgms;

import java.util.Scanner;

public class no_hashmap {
	 public static void main(String args[]) {
	        String str;
	        int i, len, counter[] = new int[256];
	 
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Please enter a string : ");
	        str = scanner.nextLine();
	 
	        //String length
	        len = str.length();
	 
	        // loop through the string 
	        // and count frequency of every character 
	        // and store it in counter array
	        for (i = 0; i < len; i++) {
	            counter[(int) str.charAt(i)]++;
	        }
	        
	        // Print Frequency of characters
	        for (i = 0; i < 256; i++) {
	            if (counter[i] != 0) {
	                System.out.println((char) i + " --> " + counter[i]);
	            }
	        }
	    }
}
