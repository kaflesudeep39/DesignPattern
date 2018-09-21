package SingletonDesignPattern;

public class LazyInitialization {
	private static LazyInitialization INSTANCE;

	private LazyInitialization() {

	}

	public LazyInitialization getInstanve() {
		if (INSTANCE == null) {
			INSTANCE = new LazyInitialization();
		}
		return INSTANCE;
	}
}
