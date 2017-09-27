package evolution;

public class Application {
	public static void main(String[] args) {
		AnyClass anyClass = new AnyClass();
		// Multiple Inheritance
		System.out.println(anyClass.anotherInterfaceMethod());
		System.out.println(anyClass.anyInterfaceMethod());
		System.out.println(anyClass.anyMethod());
	}
}
