class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(bobSizes);
        int[] ans = new int[2];
        int aliceSum = 0;
        int bobSum = 0;

        int length = aliceSizes.length > bobSizes.length ? aliceSizes.length : bobSizes.length;

        for (int i = 0; i < length; i++) {

            if (i < aliceSizes.length) {

                aliceSum += aliceSizes[i];
            }

            if (i < bobSizes.length) {

                bobSum += bobSizes[i];
            }
        }

        int delta = (bobSum - aliceSum) / 2;

        for (int candy : aliceSizes) {
            int left = 0;
            int right = bobSizes.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (bobSizes[mid] == candy + delta) {
                    return new int[] { candy, (candy + delta) };
                } else if (bobSizes[mid] < candy + delta) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return ans;
    }
}