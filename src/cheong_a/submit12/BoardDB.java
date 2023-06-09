package cheong_a.submit12;

import java.util.ArrayList;

public class BoardDB {
	
	private static ArrayList<Board> boardList = new ArrayList<>();

	private BoardDB() {
	}

	private static BoardDB instance = new BoardDB();

	public static BoardDB getInstance() {
		return instance;
	}
	// 글번호 +1 씩 증가시키는 
	public static void addBoard(Board board) {
		board.setNumber(boardList.size() + 1);

		boardList.add(board);
	}
	
	public static void showBoardList() {
		for (int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}

	}
	
}
