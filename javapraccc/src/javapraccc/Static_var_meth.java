package javapraccc;

public class Static_var_meth {
	static int x = 10;
	static int y = 90;

	static int sum() {
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(Static_var_meth.sum());
	}

}
