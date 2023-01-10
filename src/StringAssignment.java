import java.util.Iterator;

public class StringAssignment {
	public static void main(String[] args) {
		String a = "NIRAI IS GOOD GIRL, BORN04DEC";
		// String c="KARTHIKRAVI"
		int length = a.length();
		System.out.println("TOTAL LENGTH:  " + length);

		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase);

		String replace = a.replace("GOOD", "bad");
		System.out.println(replace);
		System.out.println(10+20+"Welcome"+-10.5+5*2);
		// to change string reverse by array

//		char[] charArray = a.toCharArray();
//		for (int i = charArray.length - 1; i > 0; i--){
//			System.out.print(charArray[i]);
//			}
		StringBuffer rev = new StringBuffer();
		rev.append(a);
		rev.reverse();
		System.out.println(rev);

		String replaceverygood = a.replace("GOOD", "Very Good");
		System.out.println(replaceverygood);
		// to change as char array and loop ..
		char[] s = new char[a.length()];

		for (int i = 0; i < a.length(); i++) {
			s[i] = a.charAt(i);
		}
		for (char c : s) {
			System.out.println("print  " + c);

		}
		// to find the array length (create array and find)

		String[] n = { "Nirai is Good Girl", "tsetkjvhmh" };
		System.out.println("the size of ARRAY is : " + n.length);

		// will change string as array and split..

		String[] nirai = a.split(" ");
		for (String x : nirai) {
			System.out.println("SPLIT====" + x);
		}
		// to find array length
		System.out.println("the array length is " + nirai.length);

		for (int i = 0; i < 11; i++) {

			if (i != 6) {

			}
			System.out.println(i);
		}

	}

}
