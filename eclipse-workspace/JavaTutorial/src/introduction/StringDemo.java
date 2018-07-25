package introduction;

public class StringDemo {

	public static void main(String[] args) {
		// string literal - string constant pool
		String str1 = "hello";
		
		// string literal -- points to the same constnat in the constant pool
		String str3 = "hello";
		
		
		// string object - heap
		String str2 = new String("Welcome");
		
		String stradd = str1 + " and " + str2;
		System.out.println(stradd);
		
	}

}
