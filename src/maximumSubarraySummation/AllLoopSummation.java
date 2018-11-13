package maximumSubarraySummation;

public class AllLoopSummation implements MSS {

	private int getSummation(int[] array, int f, int e) {
		int sum = 0;
		for (int i = f; i <= e; i++) {
			sum += array[i];
		}
		return sum;
	}

	@Override
	public int getMaxSummation(int[] array) {
		int maxSum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int nowSum = this.getSummation(array, i, j);
				if (maxSum < nowSum) {
					maxSum = nowSum;
				}
			}
		}
		return maxSum;
	}

}
