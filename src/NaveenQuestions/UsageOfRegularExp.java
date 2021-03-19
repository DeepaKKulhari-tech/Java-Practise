package NaveenQuestions;

public class UsageOfRegularExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Deepa@kis@&&%%aBad1991Boy";
		
		String s1=s.replaceAll("[a-zA-Z]", "");
System.out.println(s1);
	}

}
