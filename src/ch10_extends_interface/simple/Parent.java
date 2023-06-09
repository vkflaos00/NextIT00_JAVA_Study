package ch10_extends_interface.simple;

public class Parent {
	private String name;
	private int age;
	
	public Parent() {}
	
	public Parent(String name, int age) {
		super(); 
		// 부모 클래스의 기본 생성자
		this.name = name;
		this.age = age;
	}
	
	public void sayHello() {
		System.out.println("어른이입니다.");
	}

	
	//부모 클래스의 메소드를 자식 클래스에서 재 정의(Override)해서 쓰는거
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	

}
