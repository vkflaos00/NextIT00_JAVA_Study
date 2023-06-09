package ch11_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ApiDateMain {

	public static void main(String[] args) throws ParseException {
		// 현재 시간 출력
		// 1. Date 클래스 사용
		Date dateToday = new Date();
		
		// Date 객체가 new Date()로 생성되는 순간
		// 해당 Date 객체 내부에 그 때의 시간이 세팅된다.
		System.out.println(dateToday);
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date dateAfter = new Date();
		System.out.println(dateAfter);
		
		// 날짜포맷(형태)설정
		// 2023년 4월 18일 0시 39분 30초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		// .format의 파라미터에 Date 객체를 넣으면
		// 해당 Date 객체의 날짜에 대해 포맷을 적용한 문자열을 리턴
		String strToday = sdf.format(dateToday);
		System.out.println(strToday);
		
		// 2023/04/18 10:39:40
		// 2023.04.18 10:39:40
		
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		strToday = sdf.format(dateToday);
		System.out.println(strToday);
		
		System.out.println("\n============================================\n");
		
		// 2. Calendar 클래스 사용
		// .getInstence() 이지만 싱글톤 패턴이 적용되지 않음
		// new dated와 마찬가지로 .getInstance()가 실행된
		// 시점으로 세팅된 Calendar 객체가 생성됨
		Calendar calToday = Calendar.getInstance();
		System.out.println(calToday);
		
		// calendar 객체의 .getTime()을 실행하면
		// 해당 calendar 객체에 세팅된 날짜를 가지는
		// Date 객체를 리턴한다.
		Date calToDate = calToday.getTime();
		System.out.println(calToDate);
		
		// 날짜 포맷 적용
		strToday = sdf.format(calToday.getTime());
		System.out.println(strToday);
		
		System.out.println("\n============================================\n");
		
		// 3. System 클래스 사용
		// 1970년 1월 1일을 기준으로 
		// 현재까지 경과된 시간을 밀리초 단위로 리턴
		long longToday = System.currentTimeMillis();
		System.out.println(longToday);
		
		// 날짜 포맷 적용
		// sdf.format()은 파라미터로 Date 객체 또는 long 타입을 받는다.
		strToday = sdf.format(longToday);
		System.out.println(strToday);
		
		strToday = sdf.format(0L);
		System.out.println(strToday);
		
		System.out.println("\n============================================\n");
		
		// 다양한 날짜 포맷 만들기
		//1. 23/04/18 11:16:33
		//2. 2023-4-18 오전 11:16:33
		//3. 화 오전 11:16:33
		//4. 화요일 11:16
		//@. 2023.04.18 AM 11:16:33
		
		Date dateNow = new Date();
		sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		System.out.println("1. " + sdf.format(dateNow));
		
		Date dateNow2 = new Date();
		sdf = new SimpleDateFormat("yyyy-M-dd a HH:mm:ss");
		System.out.println("2. " + sdf.format(dateNow2));
		
		Date dateNow3 = new Date();
		sdf = new SimpleDateFormat("E a HH:mm:ss");
		System.out.println("3. " + sdf.format(dateNow3));
		
		Date dateNow4 = new Date();
		sdf = new SimpleDateFormat("E요일 HH:mm");
		System.out.println("4. " + sdf.format(dateNow4));
		
		Date dateNow5 = new Date();
		sdf = new SimpleDateFormat("yyyy.MM.dd a HHE:mm:ss",Locale.US);
		System.out.println("@. " + sdf.format(dateNow5));
		
		// 미국 날짜는?
		
		 TimeZone.setDefault(TimeZone.getTimeZone("US"));
	        System.out.println(new Date().toString());
	        
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss",Locale.US);
		TimeZone tz = TimeZone.getTimeZone("Asia/Seoul");
		sdf.setTimeZone(tz);
		System.out.println("미쿡날짜. " + sdf.format(dateNow));
		
		System.out.println("\n============================================\n");
		
		//문자열(String) -> Date 객체 변환
		// 유사) "12314" -> int 타입으로 변환
		// 예시) "2023/04/18", "2023/05/16" 두 날짜 차이 계산
		
		String strTomorrow = "2023/04/19 12:01:10";
		
		// strTomorrow 문자열의 날짜 포맷에 대한 sdf 생성
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date dateTomorrow = sdf.parse(strTomorrow);
		System.out.println(dateTomorrow);
		System.out.println(sdf.format(dateTomorrow));
		
		String strYesterDay = "23.04.17 09:12:11";
		
		sdf = new SimpleDateFormat("yy.MM.dd HH:mm:ss");
		Date dateYesterDay = sdf.parse(strYesterDay);
		System.out.println(strYesterDay);
//		System.out.println(sdf.format(strYesterDay));
		
		System.out.println("\n============================================\n");
		
		// 특정 날짜(23/05/01)에 대한 객체 얻기?
		// Date를 얻는다면 "23/05/01" -> sdf.parse 이용

		// Calendar로 얻기
		Calendar cal = Calendar.getInstance();
		
		//.set(년, 월, 일) 또는
		//.set(년, 월, 일, 시, 분, 초)
		// Month의 경우 1월이 0, 2월이 1,...........12월 11
		cal.set(2023, 4, 1);
		
		// Calendar 객체를 Date 객체로 변환
		System.out.println(cal.getTime());

		// Data 객체를 Calendar 객체로 변환
		Date temp = new Date();
		Calendar calTemp = Calendar.getInstance();
		calTemp.setTime(temp);
		
		// Date 타입에서 long 날짜 얻기
		System.out.println(temp.getTime());
		
		System.out.println("\n============================================\n");
		
		// 날짜 꺼내기
		// Calendar 객체가 편하다.
		Calendar anyCal = Calendar.getInstance();
		
		// 년도
		System.out.println(anyCal.get(Calendar.YEAR));
		
		// 월
		System.out.println(anyCal.get(Calendar.MONTH) +1);
		
		// 일
		System.out.println(anyCal.get(Calendar.DATE));
		
		// 시간
		System.out.println(anyCal.get(Calendar.HOUR));
		System.out.println(anyCal.get(Calendar.HOUR_OF_DAY));
		
		// 분
		System.out.println(anyCal.get(Calendar.MINUTE));
		
		// 초
		System.out.println(anyCal.get(Calendar.SECOND));
		
		System.out.println("\n============================================\n");
		
		// 날짜 연산 
		String oneDay = "2023.04.06 12:22:45";
		String twoDay = "2023.06.22 14:31:13";
		
		// Date 타입으로 바꿔주기
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Date oneDate = sdf.parse(oneDay);
		Date twoDate = sdf.parse(twoDay);
		
		// 밀리초 값이 더 클수록 최신/미래를 의미
		System.out.println(oneDate.getTime());
		System.out.println(twoDate.getTime());
		
		long diffMillSec = twoDate.getTime() - oneDate.getTime();
		System.out.println(diffMillSec + " 밀리초 차이");
		
		//diffMillSec 를 초 단위로 바꾸기
		long diffSec = diffMillSec / 1000;
		System.out.println(diffSec + "초 차이");
		long diffMin = diffSec / 60;
		System.out.println(diffMin + "분 차이");
		long diffHour = diffMin / 60;
		System.out.println(diffHour + "시간 차이");
		long diffDay = diffHour / 24;
		System.out.println( diffDay + "일 차이");
		
		// 한줄로
		long diff = diffMillSec / (1000 * 60 * 60 * 24);
		System.out.println(diff + "일 차이");
		
		System.out.println("\n============================================\n");
		
		// 디데이 계산기
		String dday = "2023.05.01";
		
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date ddayDate = sdf.parse(dday);
		System.out.println(ddayDate);
		
		// 얘를 00시 00분 00초로 만들어 주어야 한다.
		Date todayDate = new Date();
		String today = sdf.format(todayDate);
		Date parseDate = sdf.parse(today);
		System.out.println(todayDate);
		System.out.println(parseDate);
		
		
		long diffMill = parseDate.getTime() - ddayDate.getTime();
		// 11일 + 15시간인데 15시간이 없어진거심
		diffDay = diffMill /(1000 * 60 * 60 * 24);
		System.out.println(diffDay);
		
		// 실행 결과
		// 근로자의 날까지 d-day는 = -12
		
		dday = "2023.03.20";
		ddayDate = sdf.parse(dday);
		
		diffMill = parseDate.getTime() - ddayDate.getTime();
		// 11일 + 15시간인데 15시간이 없어진거심
		diffDay = diffMill /(1000 * 60 * 60 * 24);
		System.out.println(diffDay);
		
		// 실행 결과
		// 여러분의 교육기간 = +30
		
		System.out.println("\n=======================\n");
		
		// 날짜 연산
		// 한 날짜를 기준으로 날짜를 더하거나 빼기
		// Calendar 가 편함
		
		
		Calendar toCal = Calendar.getInstance();
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf.format(toCal.getTime()));
		
		// 3일 뒤
		toCal.add(Calendar.DATE, 3);
		System.out.println(sdf.format(toCal.getTime()));
		
		// 57일 뒤 
		toCal.add(Calendar.DATE, 57);
		System.out.println(sdf.format(toCal.getTime()));
		
		//7일 전?
		toCal.add(Calendar.DATE, -7);
		System.out.println(sdf.format(toCal.getTime()));
		
		//11달 뒤
		toCal.add(Calendar.MONTH, 11);
		System.out.println(sdf.format(toCal.getTime()));
		
		System.out.println("\n=======================\n");
		
		// 달력 만들기
		int year = 2023;
		int month = 4;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		System.out.println(sdf.format(calendar.getTime()));
		
		// 해당 달의 마지막 일자 얻기
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		// 해당 달의 시작 요일 
		// 1: 일요일, 2: 월요일, 3: 화요일, ... , 7: 토요일
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay);
		
		
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		
		int current = 1;
		for(int i = 0; i < 42 ; i++) {
			
			if(i < startDay - 1) {
				System.out.print("\t");
			}else {
				System.out.printf("%02d\t", current);
				current++;
				if(current >lastDay) {
					break;
				}
			}
			
			
			// i가 6, 13, 20, 27, 34 일때 출력 후 줄바꿈
			if(i % 7 == 6) {
				System.out.println();
			}
			
		}
		

		
		
		
		
	}

}
