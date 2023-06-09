package cheong_a.submit01;

public class Submit01 {

	public static void main(String[] args) {

		
		System.out.println("\n============해답 ==============\n");
		
		String name  = "김청아" ;
		int age = 34 ;
		double height =  174.4 ;
		String phone = "010-3104-1327";
		String email = "vkflaos00@gmail.com";
		
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("키:" + height);
		System.out.println("연락처:" + phone);
		System.out.println("이메일:" + email);
		
		System.out.println("\n==========================\n");
		
		String enigma = "너오구늘리뭐너먹구지리";
		
		enigma = (enigma.replace("너",""));
		System.out.println(enigma.replace("너",""));
		enigma = (enigma.replace("구",""));
		System.out.println(enigma.replace("구",""));
		enigma = (enigma.replace("리",""));
		System.out.println(enigma.replace("리",""));
		
		System.out.println("\n============해답 ==============\n");
		
		System.out.println(enigma.replace("너","").replace("구","").replace("리",""));
		
		
		System.out.println("\n==========================\n");
		
		int example = 278;
		String strCast = example + "";
		
		String twe = strCast.substring(0, 1);
		int a = Integer.parseInt(twe);
		String seven = strCast.substring(1, 2);
		int b = Integer.parseInt(seven);
		String eight = strCast.substring(2, 3);
		int c = Integer.parseInt(eight);
		System.out.println(a + b + c);
		
		System.out.println("\n============해답 ==============\n");
		
		System.out.println(Integer.parseInt(strCast.substring(0, 1)) 
						+ Integer.parseInt(strCast.substring(1, 2)) 
						+ Integer.parseInt(strCast.substring(2, 3)));
		
		
		
		
		
		
		
	}

}
