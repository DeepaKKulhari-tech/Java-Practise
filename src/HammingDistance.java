import java.util.*; 
import java.io.*;

class HammingDistance {

  public static Integer HammingDistance1(String[] strArr) {
    // code goes here  

char ch1 []=strArr[0].toCharArray();
char ch2 []=strArr[1].toCharArray();
int len=strArr[0].length();
int count=0;
for(int i=0;i<len;i++)
{
  if(ch1[i]!=ch2[i])
   count++;  
} 
    return count;
  }

  public static void main (String[] args) {  
    // keep this function call here     
   // Scanner s = new Scanner(System.in);
    //System.out.print(HammingDistance1(s.nextLine())); 
	  String [] strArr={"10011", "10100"};
	  String [] strArr1= {"helloworld", "worldhello"};
	  int i=HammingDistance1(strArr1);
	  System.out.println(i);
  }

}