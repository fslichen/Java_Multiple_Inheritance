package evolution;

public interface AnyInterface {
	default public String anyMethod() {
		return "Hello World";
	}
	
	default public String anyInterfaceMethod() {
		return "Hello World";
	}
}
