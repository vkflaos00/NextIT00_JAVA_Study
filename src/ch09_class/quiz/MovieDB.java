package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {

	ArrayList<Movie> movieList = new ArrayList<>();
	
	// 싱글톤 패턴
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "이정재 황정민 박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("범죄와의전쟁", "느그 서장 남천동 살제?", "최민식 하정우 ", "ㅂㅈㅇㅇㅈㅈ"));
		movieList.add(new Movie("악마를보았다", "내가 너 좋아하면 안되냐?", "최민식 이병헌", "ㅇㅁㄹㅂㅇㄷ"));
		movieList.add(new Movie("친절한금자씨", "너나 잘하세요.", "이영애 최민식", "ㅊㅈㅎㄱㅈㅆ"));
		movieList.add(new Movie("스물", "선배 엉덩이에 제 고추 비비고 싶어요", "김우빈 강하늘 이준호 ", "ㅅㅁ"));
		movieList.add(new Movie("타짜", "사쿠라네? 사쿠라여 ", "조승우 김혜수 백윤식", "ㅌㅉ"));
		movieList.add(new Movie("도둑들", "어으마어마한 쌍년같애", "전지현 김수현 이정재", "ㄷㄷㄷ"));
		movieList.add(new Movie("클레멘타인", "아빠!!!일어나!!!!", "스티븐시걸, 이동준", "ㅋㄹㅁㅌㅇ"));
		movieList.add(new Movie("세얼간이", "알이즈웰", "아미르칸", "ㅅㅇㄱㅇ"));
		movieList.add(new Movie("올드보이", "누구냐 너", "최민식 강혜정", "ㅇㄷㅂㅇ"));
		movieList.add(new Movie("트루먼쇼", "굿애프터눈, 굿이브닝, 굿나잇 ", "짐캐리", "ㅌㄹㅁㅅ"));
	}
	
	private static MovieDB instance = new MovieDB();
	
	public static MovieDB getInstance() {
		return instance;
	}
	
	
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}
	
	
}
