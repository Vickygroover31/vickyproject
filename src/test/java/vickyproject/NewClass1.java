package vickyproject;

public class NewClass1 {
	public static void main(String[] args) {
		NewClass n2 = NewClass.getInstance();
		System.out.println(System.identityHashCode(n2));
	}

}
