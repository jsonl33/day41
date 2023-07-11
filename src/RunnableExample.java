
public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for(int i =10;i>=1;i--) {
				System.out.println(i);
			}
		};
		Thread th = new Thread(runnable);
		th.start();
		
		Thread th1 = new Thread(()->{
			for(int i =10;i>=1;i--) {
				System.out.println(i);
			}
		});
		th1.start();
	}
}
