
public class EvenFibonacci {
	public static void main(String args[]) {
		int fibonacciFirst=1;
		int fibonacciSecond=2;
		int count=0;
		while(fibonacciSecond<4000000) {
			if(fibonacciSecond%2==0) {
				count+=fibonacciSecond;
				fibonacciSecond+=fibonacciFirst;
				fibonacciFirst=fibonacciSecond-fibonacciFirst;
			}
			else {
				fibonacciSecond+=fibonacciFirst;
				fibonacciFirst=fibonacciSecond-fibonacciFirst;
			}
		}
		System.out.println(count);
	}
}
