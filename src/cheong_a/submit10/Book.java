package cheong_a.submit10;

public class Book {

	private int number;
	private String title;
	private boolean borrow;
	
	public Book (){}
	
	public Book(int number, String title, boolean borrow) {
	
		this.number = number;
		this.title = title;
		this.borrow = false;
	}

	@Override
	public String toString() {
		
		if(borrow) {
			return "[책번호: " + number + ", 책제목:" + title + ", 대여상태: 대여중]";	
		}else {
			return "[책번호: " + number + ", 책제목:" + title + ", 대여상태: 입고중]";
		}
		// String state = (borrow) ? ("대여중") : ("입고중"); 
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isBorrow() {
		return borrow;
	}

	public void Borrow(boolean borrow) {
		this.borrow = borrow;
	}
	
}
