
import java.util.ArrayList;
import java.util.List;

public class replaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "my brown color is awesome";
		String rep = "blue";
		String sub = "brown";
		String newStr = "";

		if (str.contains("brown")) {
			newStr = str.replace("brown", rep);

			System.out.println(newStr);
		}

		replaceString.strContain(str, sub);
	

	}
//--------------------------Contains Method
	public static void strContain(String str, String sub) {

		char str1[] = str.toCharArray();
		
		char sub1[] = sub.toCharArray();
		
		String rep1="redish";
		
		char rep[]= {'r','e','d','i','s','h'};
	
		int startindex=0,count,check=0;

		for (int i = 0; i < (str1.length); i++) 
		{
			count = 0;

			for (int j = 0; j < sub1.length - 1; j++) {
				if(i+j<str1.length)
				{
				if (sub1[j] == str1[i + j]) {

					count++;
				}
				}
			}

			if (count == sub1.length - 1)
			{
				check++;
				startindex=i;
				int endIndex=i+count;
				System.out.println("found");
				System.out.println("start Index: "+startindex+" and end Index: "+ endIndex);
				
				
				replaceString.strRep(str1,rep,startindex,endIndex );
			
				break;
			}

		}
		if(check==0)
		System.out.println("Not Found");
		
		
	}
	
	public static void strRep(char str1[],char sub1[], int startIndex,int endIndex)
	{
		char newStr[]=str1;
		int slotSpace = endIndex-startIndex ;
		int extraSpace=slotSpace-sub1.length;
		int newEndIndex=0;
		
		System.out.println(newStr);
		
		for (int k=0;k<sub1.length;k++)
		{
			newStr[k+startIndex]=sub1[k];
		}
		
		if(slotSpace>sub1.length)
		{
			newEndIndex =endIndex-extraSpace;
			for(int p=newEndIndex;p<=endIndex;p++)
			{
				newStr[p]=' ';
			}
			
		}
		

		for(int n=0; n<newStr.length;n++)
		{
			System.out.print(newStr[n]);
		}
		
	}
	
	
		
		
		
	

}
