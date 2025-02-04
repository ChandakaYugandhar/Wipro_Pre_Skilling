package day_4;

import java.util.ArrayList;

public class ArrayListAssessment {

	public static void main(String[] args) {
		
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(100);
		num.add(700);
		num.add(600);
		num.add(300);
		num.add(400);
		System.out.println(num);
		
		num.remove(2);
		num.set(1, 200);
		
		for(int i=0;i<num.size();i++) {
			System.out.println((i+1)+" element: "+num.get(i));
		}
		
			
	}

}
