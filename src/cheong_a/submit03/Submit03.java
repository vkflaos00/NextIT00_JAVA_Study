package cheong_a.submit03;

public class Submit03 {

	public static void main(String[] args) {

		
		// 10 팩토리얼 
		// 10 x 9 x 8 x 7 ... x 1
		int f = 1;
		for ( int i = 0 ; i < 10 ; i++  ) {
			f = f*(10 - i);
			
		}
		System.out.println(f);
		
		System.out.println("\n=============================\n");	
		int rst = 1;
		for(int i = 1; i <= 10; i ++) {
			rst *= i;
		}
			System.out.println(rst);
		
		
		System.out.println("\n=============================\n");

		long f1 = 1;
		for ( int i = 0 ; i < 15 ; i++  ) {
			f1 = f1*(15 - i);
		} 
		System.out.println(f1);  
		  
		System.out.println("\n=============================\n");
		 
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		
		int count1 = 0;
		for (int i = 0; i < findWally.length(); i+=2) {
			String str = findWally.substring(i, i+2);
			
			if(str.equals("월리")) {
				count1++ ;
			}
			
		} 
		System.out.println(count1);	
		
		

		System.out.println("\n=============================\n");
		
		//공백 0 1 2 3 4
		// 별  5 4 3 2 1
		// i   0 1 2 3 4
		String star = "*****";
		for( int i = 0 ; i < 5 ; i++) {
		System.out.println(star.substring (i));
		
	}
		
	

	
	}

}
