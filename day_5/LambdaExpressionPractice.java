package day_5;

public class LambdaExpressionPractice {

	public static void main(String[] args) {
		Runnable lambdaRunnable=()->System.out.println("Runnig from lambda");
		
		new Thread(lambdaRunnable).start();
	}

}
