package thai.learn.singleton.example;

/*
 * Với các cách khởi tạo thứ 3 ta rõ ràng thấy rằng nếu có nhiều nhiều 
 * thread cùng đồng thời gọi method getInstance thì sẽ có
 * nhiều Singleton object được tạo ra và phá với code của chúng ta.
 * Vậy nên để tránh trường hợp trên trong khi chạy nhiều thread 
 * thì ta thêm synchronized keyword vào getInstance() Các bạn có thể tìm hiểu về Đa luồng trong java
 */

public class TheadSafeInitialization {

	private static TheadSafeInitialization instance;
	
	private TheadSafeInitialization() {
		
	}
	
	public static synchronized TheadSafeInitialization geTheadSafeInitialization() {
		if (instance == null) {
			instance = new TheadSafeInitialization();
		}
		return instance;
	}
	
}

