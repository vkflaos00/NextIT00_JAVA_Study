package cheong_a.submit12;

public class CartoonBoard extends Board{

	private String img;
	
	public CartoonBoard() {
		super();
	}

	public CartoonBoard(int number, String title, String date, String content) {
		super(number, title, date, content);
	}
	
	public CartoonBoard(int number, String title, String date, String content, String img) {
		super(number, title, date, content);
		this.img = img;
	}

	@Override
	public String toString() {
		return super.toString() + "[이미지=" + img + "]";
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
}
