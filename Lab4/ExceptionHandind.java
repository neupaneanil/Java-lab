package Lab4;

public class ExceptionHandind{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  {
				int a=12;
				int b=0;
				int div =a/b;
				System.out.println("Result="+div);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("exception cae handle"+e.getMessage());
		}

	}

}
