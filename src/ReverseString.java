
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="my name is Deepak sweta";
		String [] arr=str.split(" ");
		String srev="";

for(String s:arr)
{
	StringBuilder sb=new StringBuilder(s);
	sb.reverse();
	
	srev+=" "+sb.toString();
}


System.out.println(srev);

System.out.println("================");

for(int i=0;i<arr.length;i++)
{
	for(int j=arr[i].length()-1;j>=0;j--)
	{
		System.out.print(arr[i].charAt(j));
	}
	System.out.print(" ");
}


	}

	
}
