package maximumSubarraySummation;

public class AllLoopSummationImproved implements MSS {


	@Override
	public int getMaxSummation(int[] array) {
		int maxSum = 0;
		for (int i = 0; i < array.length; i++) {
			int subarraySum = 0;
			for (int j = i; j < array.length; j++) {
				subarraySum += array[j];
				if (maxSum < subarraySum) {
					maxSum = subarraySum;
				}
			}
		}
		return maxSum;
	}

}
