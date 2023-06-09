package cheong_a.submit02;

import java.util.Scanner;

public class Submit02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요");
		System.out.print(">>> ");
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>> ");
		int scoreA = Integer.parseInt(scan.nextLine());
		
		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>> ");
		int scoreB = Integer.parseInt(scan.nextLine());
		
		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>> ");
		int scoreC = Integer.parseInt(scan.nextLine());
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + scoreA);
		System.out.println("영어: " + scoreB);
		System.out.println("수학: " + scoreC);
		
		double doubVal = (scoreA + scoreB + scoreC) /3.0 ;
		System.out.printf("평균: %.2f\n", doubVal);
		String grade = (doubVal >= 90 ) ? ("A") : ((doubVal >= 80 ) ? ("B") : ("C")) ;
		System.out.println("등급: " + grade);
		
		
		System.out.println("\n=========================\n");
		
		
		String idBack = "4231476";
		System.out.println((Integer.parseInt(idBack.substring(0,1)) == 1) 
				? ("남") : ("여"));
		
		
		//  홀수 남 짝수 여가 아닌 1 남 그외 여라서 잘못구현됨
		// 해답
		
		String a = idBack.substring(0,1);
		int intA = Integer.parseInt (a) ;
		System.out.println( intA % 2 == 1 ? "남" : "여" );
		
		
		
	}

}
