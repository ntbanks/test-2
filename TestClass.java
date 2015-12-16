public class TestClass {

	private void printThings(int i){
		System.out.println("The number: " + i );
	}

	public static void main(String[] args){
		TestClass a = new TestClass();
		a.printThings(4);
	}
}