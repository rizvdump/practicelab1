package lab1;


public class Problem4 {

	public static void main(String[] args) {
		System.out.println(tableOfSquares(10));
		
		}

	static String tableOfSquares(int x){
		if (x == 0) {
			return "end.";
		}else {
			return x + "*" + x + "=" + x*x + "\n" + tableOfSquares(x-1);
		
		}		
	}	
}
