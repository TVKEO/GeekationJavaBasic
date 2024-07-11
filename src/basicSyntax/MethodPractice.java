package basicSyntax;

public class MethodPractice {
	public static void main(String[] args) {
		int a = 18;
		int b = 3;

		Output(SumNumbers(a, b));
		Output(MinNumbers(a, b));
		Output(MultiNumbers(a, b));
		Output(DivNumbers(a, b));
	}

	// 今までvoidだった部分が、戻り値のデータ型であるintに変わっています。
	public static int SumNumbers(int x, int y) {
		int sum = x + y;
		return sum;
	}

	public static int MinNumbers(int x, int y) {
		int min = x - y;
		return min;
	}

	public static int MultiNumbers(int x, int y) {
		int multi = x * y;

		return multi;
	}

	public static int DivNumbers(int x, int y) {
		int div = x / y;

		return div;
	}

	public static void Output(int result) {
		System.out.println("計算結果は" + result + "です。");

	}
}
