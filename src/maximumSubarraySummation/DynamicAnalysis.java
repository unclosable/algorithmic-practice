package maximumSubarraySummation;

public class DynamicAnalysis implements MSS {

	@Override
	public int getMaxSummation(int[] array) {
		int max = 0, sum = 0;
		for (int i : array) {
			sum += i;
			if (max < sum) {
				max = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}

}
