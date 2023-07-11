
public class UsingThis {
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void m() {
			MyFun04 mf = () -> {
				System.out.println("outterField = " + outterField);
				System.out.println("UsingThis.this.outterField = " + UsingThis.this.outterField	);
				
				System.out.println("innerField = "+innerField);
				System.out.println("this.innerField = "+this.innerField);
			};
			mf.method();
		}
	}
}
