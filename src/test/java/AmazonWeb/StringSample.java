package AmazonWeb;

public class StringSample {
	
	String s1="ramesh"; 
	String s2="rocky";
	
	
	public void literalstring() {
		int i= System.identityHashCode(s1);
		System.out.println(i);
		int j = System.identityHashCode(s2);
		System.out.println(j);
		if(i==j) {
			System.out.println("Given string is literal");
		}
		else{
			System.out.println("Given string is non literal");
		}
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		StringBuffer s4=new StringBuffer("rocky");
		s4.append(s1);
		s4.charAt(5);
		System.out.println(s4);

		s4.reverse();
		System.out.println(s4);
		
		StringBuilder s5=new StringBuilder("ramesh is a good boy");
		s5.replace(0,5,"rocky");
		System.out.println(s5);
		}
	
	

	public static void main(String[] args) {
		StringSample s=new StringSample();
		s.literalstring();

	}

}
