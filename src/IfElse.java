import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IfElse {

	public static void main(String[] args) {
		for (int n = 1; n < 30; n++) {
			System.out.print("number is :" + n);
			// If number is odd, print Weird
			if (n % 2 != 0) {
				System.out.println(" odd Weird");
			}

			else {
				// If number  is even and in the inclusive range of 2 to 5 , print Not Weird
				if (n >= 2 && n <= 5) {
					System.out.println(" even Not Weird");
				}

//If number is even and in the inclusive range of 6  to 20 , print Weird
//8,10,20
				if (n >= 6 && n <= 20) {
					System.out.println(" Even Weird");
				}

//f number is even and greater than 20, print Not Weird

				if (n > 20) {
					System.out.println(" Not Weird");
				}

			}
		}
	}
}
