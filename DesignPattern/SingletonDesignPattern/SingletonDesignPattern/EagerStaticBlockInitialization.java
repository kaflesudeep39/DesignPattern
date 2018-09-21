package SingletonDesignPattern;

public class EagerStaticBlockInitialization {

	private static EagerStaticBlockInitialization INSTANCE;

	static {
		try {
			INSTANCE = new EagerStaticBlockInitialization();

		} catch (Exception ex) {
			System.out.println("Couldnt create the object ofEagerStaticBlockInitialization");
		}
	}

	private EagerStaticBlockInitialization() {

	}

	public static EagerStaticBlockInitialization getInstance() {
		return INSTANCE;

	}
}
