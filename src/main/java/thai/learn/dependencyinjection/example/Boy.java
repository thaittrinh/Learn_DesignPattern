package thai.learn.dependencyinjection.example;

import lombok.Data;
import thai.learn.dependencyinjection.example.inteface.InterfaceInject;
import thai.learn.dependencyinjection.example.inteface.Outfit;

@Data
public class Boy implements InterfaceInject {

	private Outfit outfit;
	
	@Override
	public void inject(Outfit anything) {
		this.outfit = anything;	
	}

}
