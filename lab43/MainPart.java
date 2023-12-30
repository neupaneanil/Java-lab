package lab43;

public class MainPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		try {
			System.out.println("result="+t1.divide(10));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("can not divide by zero..................");
		}

	}

}
