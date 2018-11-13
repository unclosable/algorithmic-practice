package maximumSubarraySummation;

public class Main {
	public static void main(String[] args) {
		int[] testArray = { 4, 5, 6 - 1, -3, 9, -6, 7, 7, -9, 4, 1, 4, 6, -3 };

		// MSS mss = new AllLoopSummation();

		// MSS mss = new AllLoopSummationImproved();

		// MSS mss = new Division();

		MSS mss = new DynamicAnalysis();

		System.out.println(mss.getMaxSummation(testArray));

	}

}
