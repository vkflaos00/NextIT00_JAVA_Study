package cheong_a.submit_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Submit_08 {

	public static void main(String[] args) {

		ArrayList<Integer> myLotto = makeLotto();
		System.out.print(myLotto);

		System.out.println("\n====================\n");

		HashMap<String, String> infoMap = new HashMap<>();

		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		System.out.print(">>> ");
		String id = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		System.out.print(">>> ");
		String pw = scan2.nextLine();

		//입력한 id가 key값중에 존재하면 true, 없으면 false
//		infoMap.containsKey(id)
		//입력한 id가 key값중에 존재하면 value 리턴, 없으면 null리턴
		//입력한 id가 key값중에 존재하면 null이 아님, 없으면 null리턴
//		infoMap.get(id)
		
		
//		if(infoMap.get(id) != null) {
//			// id가 map안에 key값으로 존재
//			
//			// TODO 비밀번호 체크
//			if(infoMap.get(id).equals(pw)) {
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("비밀번호가 틀립니다.");
//			}
//			
//		}else {
//			// id가 key값으로 존재하지 않음
//			System.out.println("존재하지 않는 아이디 입니다.");
//			
//		}
		
		for (int i = 0; i < infoMap.size(); i++) {
			if (infoMap.containsKey(id) && infoMap.get(id).equals(pw)

			) {
				System.out.println("로그인 성공");
				break;
			} else if (infoMap.containsKey(id)  && !infoMap.get(id).equals(pw)) {
				System.out.println("비밀번호가 틀렸습니다. ");
				break;
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
				break;
			}
		}
		
		
		
	} // 메인 끝

	public static ArrayList<Integer> makeLotto() {
		// 빈 HashSet 준비
		HashSet<Integer> lotto = new HashSet<>();
		// 리턴해줄 빈 ArrayList<Integer> 준비
		ArrayList<Integer> list = new ArrayList<>();

		// 랜덤 로또 번호 생성 (1~45)
		while (lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45) + 1);

			// lotto에 로또 번호 담기

		} // 빈 ArrayList에 lotto가 가진 값들을 전부 옮기기
		list.addAll(lotto);
		// ArrayList 오름차순 정렬
		Collections.sort(list);
		// ArrayList 리턴
		return list;
	}
}
