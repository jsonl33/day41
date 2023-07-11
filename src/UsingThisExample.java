public class UsingThisExample {
	    public static void main(String[] args) {
	    	UsingThis u = new UsingThis(); // 외부 클래스 객체 생성
    		UsingThis.Inner inner = u.new Inner(); // 내부 클래스 객체 생성
	    	inner.m(); // m() 메서드 호출
	    }
}