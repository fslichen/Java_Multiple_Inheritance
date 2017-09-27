package evolution;

public class AnyClass implements AnyInterface, AnotherInterface {
	@Override
	public String anyMethod() {
		return AnyInterface.super.anyMethod();// Like what we did in C++, we need to select which method to use when there are duplicate methods in these two interfaces.
	}
}
