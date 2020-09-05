// Maximum sub-array using divide and conquer technique
class MaxSubArrayDivandCon {

	int [] Find_Max_Subarray(int[] A, int low, int high) {
			int [] result = new int[3];

				// Base case
				if (high == low) {
					result[0] = low;
					result[1] = high;
					result[2] = A[low];
					return result;
				} else {

						int mid = (low + high) / 2;

						int [] left_sum = Find_Max_Subarray (A, low, mid);

						int [] right_sum = Find_Max_Subarray (A, mid+1, high);

						int [] cross_sum =  Find_Max_Crossing_Subarray (A, low, mid, high);

						if (left_sum[2] >= right_sum[2] && left_sum[2] >= cross_sum[2])
							return left_sum;

						else if (right_sum[2] >= left_sum[2] && right_sum[2] >= cross_sum[2])
								return right_sum;
							else
								return cross_sum;
				}
	}

	int [] Find_Max_Crossing_Subarray (int[] A, int low, int mid, int high) {

					int [] result = new int[3];
					int left_sum = Integer.MIN_VALUE, max_left = 0, sum = 0, right_sum = Integer.MIN_VALUE, max_right = 0;

					for (int i=mid; i>=low; i--) {
						sum += A[i];
						if (left_sum < sum) {
							left_sum = sum;
							max_left = i;
						}
					}

					sum = 0;

					for (int i=mid+1; i<=high; i++) {
						sum += A[i];
						if (right_sum < sum) {
							right_sum = sum;
							max_right = i;
						}
					}

				result[0] = max_left;
				result[1] = max_right;
				result[2] = left_sum + right_sum;
		return result;
	}

	public static void main(String[] args) {
		int [] A = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};

		var ob = new MaxSubArrayDivandCon();

		int [] detailsOfIndexandSum =  ob.Find_Max_Subarray(A, 0, 15);

		for (int contents : detailsOfIndexandSum)
			System.out.print(contents + " ");
	}
}