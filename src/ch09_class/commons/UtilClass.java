package ch09_class.commons;

public class UtilClass {
	/**
	 * 입력한 소수를 반올림하여 소수 n번째 자리로 리턴해주는 함수입니다.
	 * @param num 반올림 하고자 하는 소수
	 * @param n   소수 n번째 자리까지 리턴
	 * @return    반올림 된 소수를 리턴
	 */
	public static double weRound(double num, int n) {
		// Math.round() 는 소수 첫째자리에서
		// 반올림한 정수를 리턴
		// 3.141592에 Math.round(3.141592) 하면
		// 3이 된다. 
		
		// 그런데 3.1로 만들고 싶다면?
		// 3.141592에 10을 곱한다 -> 31.41592
		// Math.round(31.41592) -> 31
		// 31을 10으로 나눈다 -> 3.1
		
		// 3.14로 만들려면
		// 3.141592에 100을 곱한다 -> 314.1592
		// Math.round(314.1592) -> 314
		// 314를 100으로 나눈다. -> 3.14
		
		// 10의 n제곱 구하기
		int ten = 1;
		for(int i = 0; i < n; i++) { //n회 반복하는 for문
			ten *= 10;
		}
		num *= ten;
		long temp = Math.round(num);
		double result = (double)temp / ten;
		return result;
	}
}
