package javapraccc;

public class overloading {
	int sum(int x, int y) {
		return x + y;
		
	}
	
	int sum(int x, int y, int z) {
		return x + y + z;
		
	}
	
	public static void main(String[]args) {
		overloading ob = new overloading();
		System.out.println(ob.sum(150,50));
		System.out.println(ob.sum(60,100,50));
		
	}
}
