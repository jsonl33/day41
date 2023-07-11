import java.util.ArrayList;

public class IntSupplierReport {
	public static void main(String[] args) {
		IntSupplier is = () -> {
			int randNum = (int) (Math.random()*6)+1;
			return randNum;
		};
		
		ArrayList<Integer> arrNum = new ArrayList<Integer>();
		
		for(int i = 0;i<5;i++) {
			arrNum.add(is.getAsInt());
		}
		
		for(int x : arrNum) {
			System.out.println(x);
		}
	}
}

