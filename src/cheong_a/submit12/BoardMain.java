package cheong_a.submit12;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.print(">>> ");

			int select = Integer.parseInt(scan.nextLine());

			if (select == 1) { // 글 목록 출력
				BoardDB.showBoardList();

			} else if (select == 2) {
				// TODO Board 클래스에 저장해야함
				System.out.print("글 제목을 입력해 주세요: ");
				String title = scan.nextLine();
				System.out.print("글 내용을 입력해 주세요: ");
				String content = scan.nextLine();
				
				Date dateToday = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
				String strToday = sdf.format(dateToday);
				
				Board board = new Board(0, title, strToday, content);
		
				BoardDB.addBoard(board);

			} else {
				System.out.println("종료합니다.");
				break;
			} 
		}

	}
	
	
}
