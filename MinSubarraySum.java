public class Solution { 
	int minSubArrayLen(int s, int[] nums) {
    int n = nums.length();
    int ans = INT_MAX;
    int end = 0;
    int sum = 0;
    for (int start = 0; start < n; start++) {
        sum += nums[i];
        while (sum >= s) {
            ans = min(ans, start + 1 - end);
            sum -= nums[end++];
        }
    }
    return (ans != INT_MAX) ? ans : 0;
 }
}
