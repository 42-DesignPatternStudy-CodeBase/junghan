package decoratorPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CoffeeTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream inputstream = System.in;
		InputStreamReader reader = new InputStreamReader(inputstream); // byte, char
		BufferedReader BufferedrRead = new BufferedReader(reader);// string
		Coffee baseCoffee;
		
		
		System.out.println("커피 품종을 선택하세요: (케냐/에티오피아)");
		String bean = BufferedrRead.readLine();
		
		if (bean.equals("케냐"))
			baseCoffee = new KenyaEspresso();
		else
			baseCoffee = new EthiopiaEspresso();
			
		
		System.out.println("커피 메뉴를 선택하세요:(에스프레소/아메리카노/라떼/모카라떼/크림추가라떼/크림추가모카라떼)");
		String ans = BufferedrRead.readLine();
		
		System.out.println(ans);
		if (ans.equals("아메리카노")) {
			Coffee americano = new WaterDecorator(baseCoffee);
			System.out.println("아메리카노 : " + americano.adding());
		}
		else if (ans.equals("라떼")) {
			Coffee latte = new MilkDecorator(baseCoffee);
			System.out.println("라떼 : " + latte.adding());
		}
		else if (ans.equals("크림추가라떼")) {
			Coffee whippedCreamLatte = new WhippedCreamDecorator(new MilkDecorator(baseCoffee));
			System.out.println("라떼 : " + whippedCreamLatte.adding());
		}
		else if (ans.equals("모카라떼")) {
			Coffee mochaLatte = new WhippedCreamDecorator(new MochaSyrupDecorator (new MilkDecorator(baseCoffee)));
			System.out.println("모카라떼 : " + mochaLatte.adding());
		}
		else if (ans.equals("크림추가모카라떼")) {
			Coffee whippedCreamMochaLatte = new WhippedCreamDecorator(new MochaSyrupDecorator(new MilkDecorator(baseCoffee)));
			System.out.println("모카라떼 : " + whippedCreamMochaLatte.adding());
		}
		else {
			Coffee espresso = baseCoffee;
			System.out.println("에스프레소 : " + espresso.adding());
		}

	}

}
