package day_2;

public class NPException {

	public static void main(String[] args) {
		try {
			int num[]= {10,20,30,40};
			System.out.println("array length: "+num.length);
			int arr[]=null;
			System.out.println("array length: "+arr.length);


		}
		catch(Exception e) {
			System.out.println("Can't read the array length because arr is null ");
		}
		finally{
			System.out.println("final block alway executed");
		}
	}

}
