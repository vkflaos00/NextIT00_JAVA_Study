package cheong_a.submit07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Submit_07 {

	public static void main(String[] args) {

		ArrayList<Integer> searchList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int num = ((int) (Math.random() * 11) + 10);
			searchList.add(num);
		}
		System.out.println(searchList);

//		HashSet<Integer> intSet = new HashSet<>();
//		intSet.addAll(searchList);
//		System.out.println(intSet);
//		searchList.clear();
//		searchList.addAll(intSet);

		ArrayList<Integer> newList = new ArrayList<>();

		for (int i = 0; i < searchList.size(); i++)
			// newList안에 현재의 searchList.get(i) 가 존재하지
			// 않는 경우에만 추가해주기
			if (!newList.contains(searchList.get(i))) {
				newList.add(searchList.get(i));
			}
		System.out.println(newList);

		// 중복 제거 두번째 방법
		for (int i = 0; i < searchList.size(); i++) {

			for (int k = searchList.size() - 1; k > i; k--) {
				if (searchList.get(i) == searchList.get(k)) {
					searchList.remove(k);
				}

			}
		}
		System.out.println(searchList);

		Collections.sort(newList);
		System.out.println(newList);
		Collections.sort(newList, Collections.reverseOrder());
		System.out.println(newList);

		System.out.println("\n====================\n");

		int rand = makeRandom(10, 20);
		System.out.println(rand);

		System.out.println("\n====================\n");

		ArrayList<String> strList = new ArrayList<>();
		strList.add("냉장고");
		strList.add("로봇청소기");
		strList.add("세탁기");
		strList.add("에어컨");
		strList.add("건조기");
		System.out.println(strList);

		ArrayList<String> strList2 = new ArrayList<>();
		strList2.add("노트북");
		strList2.add("TV");
		strList2.add("에어컨");
		strList2.add("플레이스테이션");
		strList2.add("로봇청소기");

		ArrayList<String> strList3 = new ArrayList<>();


		for (int i = 0; i < strList.size(); i++) {
			if (strList2.contains(strList.get(i))) {
				strList3.add(strList.get(i));
			}
		}
		System.out.println("contains" + strList3);
		
		//교집합을 위한 .retainAll()
		strList3.clear();
		strList3.addAll(strList);
		strList3.retainAll(strList2);
		System.out.println("retainALL" + strList3);
		
		// 전체 구매 목록 (합집합)

		strList3.addAll(strList);
		strList3.addAll(strList2);
		HashSet<String> strList4 = new HashSet<>();
		strList4.addAll(strList3);
		System.out.println("HashSet" + strList4);
		
		ArrayList<String> allBuy = new ArrayList<>();
		
		allBuy.addAll(strList2);
		
		for(int i = 0; i < strList.size(); i++) {
			if(!allBuy.contains(strList.get(i))) {
				allBuy.add(strList.get(i));
			}
		}
		System.out.println("allBuy" + allBuy);
		
	}// 메인끝

	public static int makeRandom(int a, int b) {
		return (int) (Math.random() * (b - a + 1) + a);
	}

}
