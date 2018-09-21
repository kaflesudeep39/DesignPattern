package SingletonDesignPattern;

public class ThreadSafe {

	private static ThreadSafe INSTANCE;

	private ThreadSafe() {

	}

	public static synchronized ThreadSafe getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ThreadSafe();
		}
		return INSTANCE;
	}
}
