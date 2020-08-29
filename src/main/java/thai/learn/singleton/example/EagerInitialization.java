package thai.learn.singleton.example;


/*
 * Với cách này thì nếu class này chưa được hoặc không sử dụng
 * thì object cũng đã được khởi tạo nên có thể gây lãng phí memory.
 */
public class EagerInitialization {

	private static EagerInitialization instance  = new EagerInitialization();
	
	private EagerInitialization() {
		
	}
	
	public static EagerInitialization getEagerInitalization() {
		return instance ;
	}
	
	
}
