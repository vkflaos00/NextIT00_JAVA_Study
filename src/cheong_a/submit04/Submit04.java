package cheong_a.submit04;

import java.util.Scanner;

public class Submit04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("문자열입력>>>  ");
		String a = scan.nextLine();

		// 문자를 받는다
		// 받은 문자의 끝 부분을 자른다
		// 자른 끝을 출력한다
		// 두번째 실행으로 돌아간다
		// 자른 끝을 실행한 문자의 끝 부분을 자른다
		// 자른 끝을 출력한다?????????
		// substring(2, 3) -> 꺼
		// substring(1, 2) -> 꾸
		// substring(0, 1) -> 로
		
		
		String b = "";
		for (int i = 1; i <= a.length(); i++) {
			b += a.substring(a.length() - i, a.length() - i + 1);
//		for(int i = 0; i < a.length(); i++) {
//			String b = a.substring(i, i+1);
//			System.out.println(b);
//			result = b + result;
//		
		}
		System.out.println(b);

		System.out.println("\n======================\n");

		Scanner scan2 = new Scanner(System.in);
		int A = 10;
		int B = 4;
		while (true) {

			System.out.println("\n==== 희영빌딩 엘리베이터 ====\n");
			System.out.println("승강기 A의 현재 위치: " + A + "층");
			System.out.println("승강기 B의 현재 위치: " + B + "층");
			System.out.print("몇층에 계시나요?[종료하시려면 q 또는 exit 입력]: ");

			String input = scan2.nextLine();
			if (input.equals("q") || input.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			int bell = Integer.parseInt(input);

			if (Math.abs(A - bell) < Math.abs(B - bell)) {
				System.out.println(bell + "층에서 엘리베이터를 호출합니다.");
				System.out.println("승강기 A가 " + bell + "층으로 이동하였습니다.");
				A = bell;
			} else if (Math.abs(A - bell) > Math.abs(B - bell)) {
				System.out.println(bell + "층에서 엘리베이터를 호출합니다.");
				System.out.println("승강기 B가 " + bell + "층으로 이동하였습니다.");
				B = bell;
			} else if (Math.abs(A - bell) == Math.abs(B - bell)) {
				if (A > B) {
					System.out.println("승강기 A가 " + bell + "층으로 이동하였습니다.");
					A = bell;
				} else if (B > A) {
					System.out.println(bell + "층에서 엘리베이터를 호출합니다.");
					System.out.println("승강기 B가 " + bell + "층으로 이동하였습니다.");
					B = bell;
				} 

			} // 컨트롤 시프트 에프로 예쁘게 줄맞추기 가능

		}

	}

}
