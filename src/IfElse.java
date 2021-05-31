import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IfElse {

	public static void main(String[] args) {
		for (int n = 1; n < 100; n++) {
			System.out.println("number is :" + n);
			// If is odd, print Weird
			if (n % 2 != 0) {
				System.out.println("odd Weird");
			}

			else {
				// If is even and in the inclusive range of to , print Not Weird
				if (n >= 2 && n <= 5) {
					System.out.println("Even Weird");
				}

//If  is even and in the inclusive range of  to , print Weird
//8,10,20
				if (n >= 6 && n <= 20) {
					System.out.println("Even Weird");
				}

//f  is even and greater than , print Not Weird

				if (n > 20) {
					System.out.println("Not Weird");
				}

			}
		}
	}
}
