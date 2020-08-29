package thai.learn.singleton.example;

/*
 * Ở cách thực hiện này thì object
 * sẽ đươc tạo ra khi getInstance() method được thực hiện lần đầu tiên.
 */
public class LazyInitializationSingleton {
	
	private static LazyInitializationSingleton instance;
	
	private LazyInitializationSingleton() {
		
	}
	
	public LazyInitializationSingleton getLazyInitializationSingleton() {
		if (instance == null) {
			instance = new LazyInitializationSingleton();
		}
	
		return instance;
	}
	
	
}
