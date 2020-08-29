package thai.learn.dependencyinjection.example.impl;

import thai.learn.dependencyinjection.example.inteface.Outfit;

public class Dress implements Outfit {

	@Override
	public void wear() {
		System.out.println("wear dress...");	
	}

}
