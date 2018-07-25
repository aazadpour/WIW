package introduction;

import javax.print.DocFlavor.CHAR_ARRAY;

public class StringMethods {

		public static void main(String[] args ) {
			String str = "This is the test string";
			String str1 = "Hello";
			String str2 = "Hello";
			String str3 = "Welcome";
			String str4 = " Spaces are all around   ";
			String str6 = "hello";
			
			System.out.println(str.length());
			System.out.println(str.charAt(2));
			System.out.println(str.concat(" This is the appended string"));
			System.out.println(str.contains("is"));
			System.out.println(str.contains("si"));
			System.out.println(str.startsWith("This"));
			System.out.println(str.startsWith("is"));
			System.out.println(str.endsWith("string"));
			System.out.println(str1.equals(str2));
			System.out.println(str.indexOf("h"));
			System.out.println(str.isEmpty());
			System.out.println(str4.trim());
			System.out.println(str6.replace("e", "a"));
			System.out.println("substring example 1: " + str.substring(5));
			System.out.println("Substring example 2:" + str.substring(5, 10));
		
			char[] charArray = str.toCharArray();
			for (int i =0; i<charArray.length; i++){
				System.out.println("index" + i + " is: " + charArray[i]);
			}
			
			System.out.println("Lowercase" + str.toLowerCase());
			System.out.println("Uppercase" + str.toUpperCase());
		}
}
