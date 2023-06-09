package ch09_class.homepage;

import java.util.ArrayList;

public class MemberDB {
	private ArrayList<Member> memList = new ArrayList<>();

	// 싱글톤 패턴 적용
	// 1. 기본 생성자의 접근 제어자를 private로 막는다.
	private MemberDB() {
		// 기본 생성자에 실행구문 추가
		memList.add(new Member("2023023001", "a001", "123a", "배준호"));
		memList.add(new Member("2023023002", "b001", "123b", "고동욱"));
		memList.add(new Member("2023023003", "c001", "123c", "홍민경"));

	}

	// 2. 필드 변수에 자기 자신 객체를 소환한다.
	// static을 붙여주어야 다른 클래스에서
	// 이 객체를 소환하지 않고 접근할 수 있다.
	// 접근 후 직접적으로 수정할 수 없게 private 처리
	private static MemberDB instance = new MemberDB();

	// 3. instance에 대한 getter 생성
	public static MemberDB getInstance() {
		return instance;
	}

	// 회원 목록 조회
	public void showMemList() {
		for (int i = 0; i < memList.size(); i++) {
			System.out.println(memList.get(i));
		}
	}

	// 학번 생성 메소드
	public String makeStuId() {
		return "202302300" + (memList.size() + 1);
	}

	// 회원 가입 메소드
	public void registMember(Member mem) {
		// 파라미터로 들어온 mem 객체에 대해
		// mem.getId()가 memList.get(i).getId()와 같은게 있다면
		// 아이디가 중복되므로 회원가입 안 시켜줌
		for(int i= 0; i< memList.size(); i++) {
			if(mem.getId().equals(memList.get(i).getId())){
				System.out.println("중복된 아이디입니다.");
				return;
			}
		}
		memList.add(mem);
	}

	// memList에서 파라미터로 들어온
	// id와 pw가 일치하는 Member 객체를
	// 찾아서 해당 Member 객체를 리턴하는 메소드
	// ahtckwdkTekaus null 리턴
	public Member login(String id, String pw) {
		for (int i = 0; i < memList.size(); i++) {
			if (memList.get(i).getId().equals(id) && memList.get(i).getPassword().equals(pw))
				;

			return memList.get(i);
		}

		return null;

	}
}
