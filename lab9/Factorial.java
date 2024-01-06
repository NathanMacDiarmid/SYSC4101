import java.util.ArrayList;

public class Factorial {
	public static void compute(FeedOfIntValues f) {
		int i;
		while (f.hasNext()) {
			i = f.getNextIntValue();
			System.out.println("Factorial of "+i+" = "+factorial(i));
		}
	}
	public static long factorial(int num) {
		if (num>=1)
			return num * factorial(num-1);
		else
			return 1;
	}

	public static void main(String[] args) {
		System.out.println("This is the result for each input and output pair respectfully:");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		FactorialTest stub = new FactorialTest(list);
		Factorial.compute(stub);
	}
}
