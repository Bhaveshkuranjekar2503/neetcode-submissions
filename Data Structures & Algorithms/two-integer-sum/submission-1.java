class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            Integer neededIndex = hMap.get(needed); // IF not it will return null
            if (neededIndex != null) {
                return new int[] {neededIndex, i};
            }

            hMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
