package lab41;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int div = 0;
		try  {
			int a=12;
			int b=0;
			 div =a/b;
			System.out.println("Result="+div);
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("exception cae handle"+e.getMessage());
	}
		finally {
			System.out.println("Result="+div);
		}

	}

}
