package arrays;

public class MyArrays {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 6, 8, 9, 131 };
		System.out.println(nums.length);

		System.out.println("Nums[0]: " + nums[0]);
		nums[0] = 27;
		System.out.println("Nums[0]: " + nums[0]);

		char[] word = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(word.length);
		String s = "hello";
		System.out.println(s.length());

		int[] nums2 = new int[7]; // new int array of length 7

		System.out.println(nums2);

		for (int i = 0; i < nums2.length; i++) {
			System.out.println(nums2[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		int[] fixed = new int[1];

		fixed = new int[4];
	}

}
