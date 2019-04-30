public class totaldigits {
	public static void main(String[] args) {
		int count = 0;
		int n = 12568;
		while (n > 0) {
			n = n / 10;
			count++;

		}
		System.out.println("Total digits "+count);
	}

}
