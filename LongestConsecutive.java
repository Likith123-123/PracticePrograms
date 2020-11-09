public static int longestConsecutive(int[] n) {
// if array is empty, return 0
if (n.length == 0) {
return 0;
}
Set<Integer> set = new HashSet<Integer>();
int max = 1;
for (int a : n)
set.add(a);
for (int a : n) {
int left = a - 1;
int right = a + 1;
int count = 1;
while (set.contains(left)) {
count++;
set.remove(left);
left--;
}
while (set.contains(right)) {
count++;
set.remove(right);
right++;
}
max = Math.max(count, max);
}
return max;
}