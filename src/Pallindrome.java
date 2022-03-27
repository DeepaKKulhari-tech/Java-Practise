import java.util.*; 
import java.io.*;

class Pallindrome {

  public static Boolean Palindrome(String str2) {
    // code goes here  
    
    int len=str2.length();
    String str= str2.toLowerCase();
    char ch []=str.toCharArray();
    String str1= "";

     for(int i=len-1;i>=0;i--)
     {
      str1=str1+ch[i];
     }
     System.out.println(str1);
    
    if(str1.equals(str))
    return true;
    else
    return false;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any pallindrome name");
	
    System.out.println(Palindrome(s.nextLine())); 
  }

}