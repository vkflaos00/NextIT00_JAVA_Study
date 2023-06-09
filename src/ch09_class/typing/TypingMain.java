package ch09_class.typing;

import java.util.ArrayList;
import java.util.Scanner;

public class TypingMain {

	public static void main(String[] args) {
		// 타자 연습 게임
		
		Scanner scan = new Scanner(System.in);
		
		// 단어 목록
		// static 메소드는 해당 클래스를 굳이 객체로 만들지 않더라도 
		// 사용이 가능하다.
		// Math.random();
		ArrayList<String> wordList = Dictionary.makeWordList(Dictionary.OPTION_STUDENT_NAME );
		System.out.println(Dictionary.OPTION_STUDENT_NAME );
		
		
		
		
		// 현재 시간 저장
		// 1970년 1월 1일을 기준으로 
		// 현재까지 경과된 시간을 밀리초 단위로 리턴
		long before = System.currentTimeMillis();
		System.out.println(before);
		
		
		while(true) {
			// wordList에 담긴 단어가 랜덤 출력
			// = Math.random() 실행 결과가 wordList의 인덱스 중 하나
			// = wordList의 인덱스 0 ~ wordList.size()-1
			int RandIdx = (int)(Math.random() * wordList.size());
			System.out.println(wordList.get(RandIdx));
			
			// 출력된 단어를 입력
			System.out.print(">>> ");
			String input = scan.nextLine();
			// 입력한 단어가 출력된 단어와 일치하는지 체크
			if(wordList.get(RandIdx).equals(input)) {
				// 일치한다면 wordList에서 해당 단어를 삭제
				wordList.remove(RandIdx);
			}
			// 일치하지 않으면 해당 단어가 삭제되지 않고 또 입력받음
			
			// 위 과정을 반복 (wordList.size()가 0이 될 때 까지
			if(wordList.size()==0) {
				break;
			}
			
		}
		long after = System.currentTimeMillis();
		// after에서 before를 빼면, 타라를 친 시간이 구해진다.
		long diff = after-before; // diff는 밀리초 단위
		// 초 단위로 변환
		// 31872밀리초 -> 31.872초
		double result = diff / 1000.0; // 31.0 초
		System.out.println(result + "초 걸리셨습니다.");
		
		
		
		
		
		

		

		
		
		
		
		
		
		
		
		
		
		
	}

}
