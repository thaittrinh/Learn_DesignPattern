package thai.learn.dependencyinjection.example;

import thai.learn.dependencyinjection.example.impl.Bikini;
import thai.learn.dependencyinjection.example.impl.Dress;

public class Main {

	public static void main(String[] args) {
		// cách 1 khởi tạo qua contructor
		Girl girl = new Girl(new Bikini());
		girl.getOutfit().wear();
		
		// cách 2 qua setter
		girl.setOutfit(new Dress());
		girl.getOutfit().wear();
		
		// cách 3 inteface inject.
		Boy boy = new Boy();
		boy.inject(new Dress());
		boy.getOutfit().wear();
	}
	
}
