package ch08_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		// 맵(hashMap)의 선언
		// key와 value의 한 쌍인 데이터를 저장
		HashMap<String, String> stuMap = new HashMap<>();
		
		// 다형성 이용
		Map<String, Integer> coinMap = new HashMap<>();
		
		
		// .put(key, value)
		// 데이터 추가
		stuMap.put("첫째", "예슬");
		stuMap.put("둘째", "종현");
		stuMap.put("셋째", "서영");
		
		// 순서는 보장하지 않는다.
		System.out.println(stuMap);
		
		// 중복된 Key값을 허용하지 않는다. 
		// 중복된 Key값을 추가하면 기존 Value가 덮어씌워짐
		// (Key에 대한 Value 수정이 필요한 경우 put을 이용
		stuMap.put("첫째", "경호");
		System.out.println(stuMap);
		
		coinMap.put("비트코인", 36000000);
		coinMap.put("도지코인", 123);
		System.out.println(coinMap);
		
		System.out.println("\n=======================\n");
		
		// .get(key)
		// key에대한 value를 리턴
		System.out.println(stuMap.get("첫째"));
		// 존재하지 않는 key값을 입력하면 null 리턴 
		System.out.println(stuMap.get("넷째"));
		
		// .size()
		// Map 내 저장된 데이터 수 리턴
		System.out.println(stuMap.size());
		
		// .containsKey(값)
		// Map 안에 있는 키(key)중에 괄호 안 값이 있다면 true, 없다면 false
		System.out.println(stuMap.containsKey("첫째"));
		
		// .containsValue(값)
		// Map 안에 있는 값(Value)중에 괄호 안 값이 있다면 true, 없다면 false
		System.out.println(stuMap.containsValue("종현"));
		
		// .remove(key)
		// 괄호 안 key 값에 대한 데이터 삭제
		coinMap.remove("도지코인");
		System.out.println(coinMap);
		
		System.out.println("\n========================\n");
		
		// Map 순회
		// 1. keySet 이용
		Set<String> keySet = stuMap. keySet();
		
		// 향상된 for문으로 set 순회
		for(String key : keySet) {
			System.out.println(key);
			System.out.println(stuMap.get(key));
		}
		
		// 2. EntrySet 이용
		Set< Entry <String, String>> entrySet = stuMap.entrySet();
		
		// 향상된 for문 사용
		for(Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("\n========================\n");
		
		// 3. forEach (람다식)
		stuMap.forEach(  (key, value) -> System.out.println(key + ":" + value) );
		
		
		
		

	}

}