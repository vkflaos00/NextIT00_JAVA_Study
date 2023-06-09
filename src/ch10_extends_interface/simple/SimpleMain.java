package ch10_extends_interface.simple;


// 자바에서는 기본적으로 모든 클래스가
// Object 클래스를 상속받고 있다.
// (보이지 않는 상태)
public class SimpleMain {

	public static void main(String[] args) {
		Parent papa = new Parent("아빠",30);
		System.out.println(papa);
		
		Child baby = new Child();
		System.out.println(baby);
		
		baby.setName("아기");
		baby.setAge(3);
		baby.sayHello();
		
		System.out.println(baby);
		
		//다형성
		//면접, 정처기 문제에 자주 출제)
		Parent nami = new Child("나미", 17);
		System.out.println(nami);
		System.out.println(nami.getClass());
		nami.sayHello();
	}

}