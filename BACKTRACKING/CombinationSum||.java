class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void fun(int[] candidates, int target, int start, List<Integer> list, int sum) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (sum > target) return;
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            list.add(candidates[i]);
            fun(candidates, target, i + 1, list, sum + candidates[i]);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        fun(candidates, target, 0, new ArrayList<>(), 0);
        return res;
    }
}
