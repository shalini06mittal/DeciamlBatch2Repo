package oops;

public class TestConstructor {

	public static void main(String[] args) {
		ProductConstructor p1 = new ProductConstructor();
		ProductConstructor p2 = new ProductConstructor(1, "p1", "d1", 232);
		//p2 = new ProductConstructor(1, "p1", "d1", 878);
		int x = 10;
		System.out.println(x);// 10
		// p2 is an object
		// want string representation of p2, implement toString()
		System.out.println(p2);// toString is implicitly called

	}

}
