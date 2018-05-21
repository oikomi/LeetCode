package org.miaohong.array;


import java.util.Arrays;

public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int index = 0;
		for (int i = 1; i < nums.length; i ++) {
			if (nums[index] != nums[i]) {
				nums[++index] = nums[i];
			}
		}

		return index + 1;
	}


	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 2, 3, 3, 5, 9, 9, 9, 10, 11};

		int result = removeDuplicates(nums);

		Arrays.stream(nums).forEach((int i) -> {
			System.out.print(i + " ");
		});
		System.out.println();
		System.out.println(result);
	}

}
