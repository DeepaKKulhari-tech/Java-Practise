
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
		
		char rep[]= {'r','e','d'};
	
		int index=0,count,check=0;

		for (int i = 0; i < (str1.length); i++) {
			count = 0;

			for (int j = 0; j < sub1.length - 1; j++) {
				if (sub1[j] == str1[i + j]) {

					count++;
				}
			}

			if (count == sub1.length - 1) {
				check++;
				index=i;
				System.out.println(index);
				System.out.println("found");
				replaceString.strRep(str1,rep, index);
				break;
			}

		}
		if(check==0)
		System.out.println("Not Found");
		
		
	}
	
	public static void strRep(char str1[],char sub1[], int index)
	{
		char newStr[]=str1;
		System.out.println(newStr);
		for (int k=0;k<sub1.length;k++)
		{
			newStr[k+index]=sub1[k];
		}
		
		for(int n=0; n<newStr.length;n++)
		{
			System.out.print(newStr[n]);
		}
		
	}

}
