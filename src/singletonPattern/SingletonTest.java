package singletonPattern;

//아래의 코드가 항상 true가 되도록 Singleton Pattern 으로 구현하세요

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instanceA = Singleton.getInstance();
		Singleton instanceB = Singleton.getInstance();
		System.out.println(instanceA == instanceB);
	}

}



