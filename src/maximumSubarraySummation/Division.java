package maximumSubarraySummation;

public class Division implements MSS {

	int max(int... is) {
		int max = 0;
		for (int i : is) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	int getDivideCount(int[] array, int f, int e) {

		if (f == e) {
			return array[f] > 0 ? array[f] : 0;
		}

		int mid = (f + e) / 2;
		int leftMax = getDivideCount(array, f, mid), rigthMax = getDivideCount(array, mid + 1, e);

		int maxLeftWithBorder = 0, count = 0;
		for (int i = mid; i >= f; i--) {
			count += array[i];
			if (count > maxLeftWithBorder) {
				maxLeftWithBorder = count;
			}
		}

		int maxRightWithBorder = 0;
		count = 0;
		for (int i = mid + 1; i <= e; i++) {
			count += array[i];
			if (count > maxRightWithBorder) {
				maxRightWithBorder = count;
			}
		}

		return max(leftMax, maxLeftWithBorder + maxRightWithBorder, rigthMax);
	}

	@Override
	public int getMaxSummation(int[] array) {
		return getDivideCount(array, 0, array.length - 1);
	}

}
