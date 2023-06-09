package cheong_a.submit12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	
	private int number;
	private String title;
	private String date;
	private String content;
	
	public Board() {}


	public Board(int number, String title, String date, String content) {
		super();
		this.number = number;
		this.title = title;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
	    this.date = sdf.format(new Date());
		this.content = content;
	}
	


	@Override
	public String toString() {
		return "[" + number + ". | " + title + " | " + date + "]";
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
