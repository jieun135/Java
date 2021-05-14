package sec01;

public class Sum {

	public static void main(String[] args) {
		System.out.println(sumExceptFirst(1,2,3,4));
		int arr[] = {2,3,4,5};
		System.out.println(sumExceptFirst(1,arr));
		System.out.println(sumExceptFirst(1,2,3,4,5));
	}

	private static int sumExceptFirst(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return j+k+l;
	}

	private static int sumExceptFirst(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		return j+k+l+m;
	}

	private static int sumExceptFirst(int i, int[] arr) {
		int sum = 0;
		for(int result = 1; result<arr.length; result++ ) {
			sum += arr[result];
		}
		return sum;
	}
}
