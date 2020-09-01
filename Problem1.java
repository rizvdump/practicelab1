package lab1;

import java.util.ArrayList;

public class Problem1{
	public static void main(String[] args) {
		ArrayList<Integer> Collection = new ArrayList<Integer>();
		Collection.add(1);
		Collection.add(7);
		Collection.add(3);
		Object[] x = Collection.toArray();

		
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
		sum = sum + (int) x[i];
		}
		System.out.println(sum);

	}
}