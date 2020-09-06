@SuppressWarnings("preview")
public class InstanceOfX {

	public static void foo(Object obj) {
		
		
		if (obj instanceof Integer i ) {
			
			System.out.println("Integer:" + i);
			
		} else if (obj instanceof String s) {
			
			System.out.println("String:" + s);
		}
	}

	public static void main(String[] obj) {
		foo(100);
		foo("Hello");
	}
}
