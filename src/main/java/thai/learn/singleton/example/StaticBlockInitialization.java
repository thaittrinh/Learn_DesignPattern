package thai.learn.singleton.example;

/*
 * Object sẽ được khởi tạo khi class được load.
 */
public class StaticBlockInitialization {
	
	private static StaticBlockInitialization instance; 
	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occured in creating singleton instance");
		}
	}
	
	private StaticBlockInitialization () {
		
	}
	
	public StaticBlockInitialization getStaticBlockInitialization() {
		return instance;
	}
	
}
