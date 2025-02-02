package day_2;

public class IOBException {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		try {
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
		}
		catch(Exception e) {
			System.out.println("caught exception array index out of bound ");
		}
		finally {
			System.out.println("try catch finished");
		}
		
	}

}
