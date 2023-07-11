
public class IntSupplierReport {
	public static void main(String[] args) {
		IntSupplier is = () -> {
			int randNum = (int) (Math.random()*6)+1;
			return randNum;
		};
		
		for(int i = 1;i<=5;i++) {
			System.out.println(is.getAsInt());
		}
	}
}

