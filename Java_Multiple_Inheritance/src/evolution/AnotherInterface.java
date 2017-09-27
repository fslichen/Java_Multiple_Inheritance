package evolution;

public interface AnotherInterface {
	default public String anyMethod() {
		return "Hello World";
	}
	
	default public String anotherInterfaceMethod() {
		return "Goodbye Past";
	}
}
