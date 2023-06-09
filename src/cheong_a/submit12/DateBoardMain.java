package cheong_a.submit12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import ch09_class.nextit.NextStudent;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		// dbList에 랜덤 날짜를 가지는 DateBoard 객체 100개 삽입
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for (int i = 0; i < 100; i++) {
			int randDay = (int) (Math.random() * 365) + 1; // 1~365
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, randDay * -1);

			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard((i + 1) + "번째 생성된 글", strDate));
		}
		System.out.println("\n=============================\n");
		// 날짜 버블정렬

		for (int k = 0; k < dbList.size() - 1; k++) {
			for (int i = 0; i < dbList.size() - 1; i++) {
				// 날짜 비교
				// String date
				// 2023.02.21 12:34:56 -> Date 객체 with sdf.parse
				Date left = sdf.parse(dbList.get(i).getDate());
				Date right = sdf.parse(dbList.get(i + 1).getDate());

				if (left.getTime() < right.getTime()) {
					DateBoard t = dbList.get(i);
					dbList.set(i, dbList.get(i + 1));
					dbList.set(i + 1, t);
				}
			}
		}
		for (int i = 0; i < dbList.size(); i++) {
			System.out.println((i + 1) + "번. " + dbList.get(i));
		}
		// 최신에서 오래된순으로 (내림차순)

		System.out.println("\n=============================\n");

		Collections.sort(dbList, new Comparator<DateBoard>() {
			@Override
			public int compare(DateBoard o1, DateBoard o2) {
				return o1.getDate().compareTo(o2.getDate());
			}
		});

		for (int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		// 오래된 것에서 최신 순으로 (오름차순)

		System.out.println("\n=============================\n");
		// 최근 30일 내 게시물만 보기

		Calendar cal = Calendar.getInstance();
		// 한달 전 날짜로 세팅

		cal.add(Calendar.MONTH, -1);
//		cal.add(Calendar.DATE, -30);
		
		Date today = new Date();
		long diff = today.getTime()-(1000*60*60*24*30L); //한달전 날짜의 밀리초
		
		for (int i = 0; i < dbList.size(); i++) {
			Date temp = sdf.parse(dbList.get(i).getDate());

			// temp를 밀리초로 나타낸 것이
			// 한달 전 날짜를 밀리초로 나타낸 것 보다 크면
			// 최근 한달 내 데이터를 의미
			if (temp.getTime() > cal.getTime().getTime()) {
				System.out.println(dbList.get(i));
			}

		}

		// 내가 한 동일코드

//		for (int i = 0; i < dbList.size(); i++) {
//			DateBoard db = dbList.get(i);
//			String postDateStr = db.getDate();
//
//			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
//			Date postDate = null;
//			try {
//				postDate = sdf1.parse(postDateStr);
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
//
//			Calendar cal = Calendar.getInstance();
//			cal.add(Calendar.MONTH, -1); // 최근 한달 이전으로 설정
//
//			// 게시일이 한달 이내인 경우에만 출력
//			if (postDate.after(cal.getTime())) {
//				System.out.println("ㅇ.ㅇ" + db);
//			}
//		}
		System.out.println("\n=============================\n");
		// dbList에서 이번달에 작성된 게시글만 출력해주세요.
		// (이번달이라고 5를 쓰지 마시구.. 코드상으로 이번달을 얻어서)
		Calendar toMonth = Calendar.getInstance();
		
		int year = toMonth.get(Calendar.YEAR); 
		int month = toMonth.get(Calendar.MONTH);
		
//		System.out.println(year);
//		System.out.println(month);
		
		for(int i = 0; i< dbList.size(); i++) {
			Date temp = sdf.parse(dbList.get(i).getDate());
			Calendar tempCal = Calendar.getInstance();
			tempCal.setTime(temp);
			
			int tempYear = tempCal.get(Calendar.YEAR);
			int tempMonth = tempCal.get(Calendar.MONTH);
			
			if(year == tempYear && month == tempMonth) {
				System.out.println(dbList.get(i));
			}
			
		}
		System.out.println("\n=============================\n");
		// dbList에서 2월에 작성된 게시글만 출력해주세요.
		
		month = 2 - 1; // 이것만 2월로 설정하게 1 빼주고 위코드 동일
		
		for(int i = 0; i< dbList.size(); i++) {
			Date temp = sdf.parse(dbList.get(i).getDate());
			Calendar tempCal = Calendar.getInstance();
			tempCal.setTime(temp);
			
			int tempYear = tempCal.get(Calendar.YEAR);
			int tempMonth = tempCal.get(Calendar.MONTH);
			
			if(year == tempYear && month == tempMonth) {
				System.out.println(dbList.get(i));
			}
			
		}
		
		System.out.println("\n=============================\n");
		// 2023년 2월 14일부터 2023년 3월 21일까지 작성된 게시글만 출력
		
		String fromStr = "2023.02.14";
		String toStr = "2023.03.21";
		
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		Date fromDate = sdf.parse(fromStr);
		Date toDate = sdf.parse(toStr);
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		for(int i = 0; i < dbList.size(); i++) {
			Date temp = sdf.parse(dbList.get(i).getDate());
			
			// temp를 밀리초로 바꾼 값이
			// fromDate를 밀리초로 바꾼 것 보다 크고
			// toDate를 밀리초로 바꾼 것 보다 작은 것
			if(temp.getTime() >= fromDate.getTime() && 
					temp.getTime() < toDate.getTime()) {
				System.out.println(dbList.get(i));
			}
		}
	}

//	// yyyy.MM.dd HH:mm:ss
//	private static Date parseDate(String strDate) {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
//		try {
//			return sdf.parse(strDate);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	// 최근 한달 이전의 날짜를 구하는 메서드
//	private static Date getOneMonthAgo() {
//		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.MONTH, -1);
//		return cal.getTime();
//	}
}