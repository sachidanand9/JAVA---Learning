package String;

public class compare {
	public static void main(String[] args) {
		String s1 = "XYZ";
		String s2 = "XYZ";

		String s3 = new String("XYZ");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1);
	}
}
