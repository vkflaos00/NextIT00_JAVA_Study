package ch10_extends_interface.ramen;

public class JinRamen extends Ramen{
	
	public JinRamen() {}
	
	public JinRamen(String name, int price) {
		super(name, price);
	}
	
	//@Override원래는 붙여야되는데 안붙여도 작동함
	public void printRecipe() {
		System.out.println("끓는 물에 면과 스프를 넣고, 3분 후에 잘 저어서 드세요.");
	}
	
	
	
	
	
	

}
