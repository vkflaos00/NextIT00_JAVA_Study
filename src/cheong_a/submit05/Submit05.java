package cheong_a.submit05;

public class Submit05 {

	public static void main(String[] args) {

		makeTree(10);
		makeTree(7);

		System.out.println("\n=======================\n");

		String example = "로꾸꺼 로꾸꺼";
		String result = reverseStr(example);
		System.out.println(result);

		System.out.println("\n=======================\n");

		String myBinarystr = makeBinary(23);
		System.out.println(myBinarystr);

	}

	public static void makeTree(int num) {
		for (int i = 0; i < num; i++) {
			String space = "";

			for (int k = 0; k < num - i; k++) {
				space += " ";
			}

			String stars = "";

			for (int k = 0; k < (i * 2) + 1; k++) {
				stars += "*";

			}
			System.out.println(space + stars);
		}

	}

	public static String reverseStr(String example) {
		String b = "";
		for (int i = 1; i <= example.length(); i++) {
			b += example.substring(example.length() - i, example.length() - i + 1);

		}
		return b;

	}

	public static String makeBinary(int num) {
		String str = "";
		String result = "";
		while (true) {
			if (num == 1) {
				str += "1";
				break;
			} else if (num == 0) {
				str += "0";
				break;
			} else if (num % 2 == 1) {
				str += "1";
				num = num / 2;
			} else if (num % 2 == 0) {
				str += "0";
				num = num / 2;
			}

		}
		for (int i = 1; i <= str.length(); i++) {
			result += str.substring(str.length() - i, str.length() - i + 1);
		}
		return result;
	}
}
