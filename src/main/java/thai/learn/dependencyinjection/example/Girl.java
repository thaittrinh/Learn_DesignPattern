package thai.learn.dependencyinjection.example;

import lombok.Data;
import thai.learn.dependencyinjection.example.inteface.Outfit;

@Data
public class Girl {
	
	private Outfit outfit;
	
	public Girl(Outfit anything) {
		this.outfit = anything;
	}
	
	
}
