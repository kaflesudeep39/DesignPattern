package SingletonDesignPattern;

public class ThreadSafe_Optimized {
	private static ThreadSafe_Optimized INSTANCE;

	private ThreadSafe_Optimized() {

	}

	public ThreadSafe_Optimized getInstance() {
		if (INSTANCE == null) {
			synchronized (ThreadSafe_Optimized.class) {
				if (INSTANCE == null) {
					INSTANCE = new ThreadSafe_Optimized();
				}
			}
		}
		return INSTANCE;
	}
}
