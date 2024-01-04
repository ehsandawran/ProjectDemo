package demopackage;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Demo Print");

		System.out.println("Sprint Demo1");
		System.out.println("Sprint Demo2");

		DemoClass obj = new DemoClass();

		obj.demoLoop();

	}

	public void demoLoop() throws InterruptedException {

		for (int i = 0; i < 100; i++) {
			System.out.println("This is a demo loop...");
			
			Thread.sleep(100);

		}

	}

}
