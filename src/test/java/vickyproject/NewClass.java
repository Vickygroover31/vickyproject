package vickyproject;

public class NewClass {
	
	public static NewClass n1=null;
	
	public void vignesh() {
		System.out.println("VIGNESH");
	}
	public void sivaShankari() {
		System.out.println("SIVASHANKARI");
	}
	public static NewClass getInstance() {
		if(n1==null) {
			n1 = new NewClass();
			
		}
		return n1;
		
	}
	
	private NewClass() {}
	
	public static void main(String[] args) {
		NewClass n = new NewClass();
		System.out.println(System.identityHashCode(n));
		
		
	}
		
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	

}
