package cheong_a.submit09;

import java.util.ArrayList;
import java.util.Collections;

public class productMain {

	public static void main(String[] args) {

		Product frize = new Product("냉장고", 2000000);
		Product tv = new Product("TV", 1000000);
		Product air = new Product("에어컨", 800000);
		Product com = new Product("컴퓨터", 1300000);
		Product fan = new Product("선풍기", 100000);

		ArrayList<Product> productList = new ArrayList<>();

		productList.add(frize);
		productList.add(tv);
		productList.add(air);
		productList.add(com);
		productList.add(fan);
		System.out.println(productList);

		System.out.println("\n=========================\n");

		Collections.sort(productList, (prodA, ProdB) -> prodA.getPrice() - ProdB.getPrice());		
		
		for(int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i));
		}
		System.out.println("\n=========================\n");
		
		for (int k = 0; k < productList.size() - 1; k++) {
			for (int i = 0; i < productList.size() - 1; i++) {
				if (productList.get(i).getPrice() > productList.get(i + 1).getPrice()) {
					Product t = productList.get(i);
					productList.set(i, productList.get(i + 1));
					productList.set(i + 1, t);
				}
			}
		}
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i));
		}
		
		System.out.println("\n=========================\n");
		
		for (int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getName() == "TV") {
				System.out.println(i);
			}
		}
		
	}

}
