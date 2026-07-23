class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int fathsest = 0;
        int currentend = 0;

        for (int i = 0; i < nums.length -1; i++) {
            fathsest = Math.max(fathsest, i + nums[i]);
            if (i == currentend) {
                jump++;
                currentend = fathsest;
            }
        }
        return jump;
    }
}
