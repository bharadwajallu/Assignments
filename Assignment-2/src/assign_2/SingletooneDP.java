package assign_2;

public class SingletooneDP {
	private static SingletooneDP createInstance = new SingletooneDP();
	private SingletooneDP() {
		
	}

	public static SingletooneDP getInstance() {
		return createInstance;
	}
	public void name() {
		System.out.println("Bharadwaj Allu");
	}
}
