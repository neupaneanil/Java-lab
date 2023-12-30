package ExampleThrow;

 class ExceptionThrow {
	 int div;
	void div(int a,int b)throws ArithmeticException {
		if(b==0) {
			System.out.println("trying to divide by zero"+div);
			
			throw new ArithmeticException();
			
		}
		else {
		 div=a/b;
			System.out.println("Result"+div);
		}
	}

}
