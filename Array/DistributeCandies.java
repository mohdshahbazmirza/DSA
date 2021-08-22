class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : candyType) hs.add(i);
        return Math.min(candyType.length / 2, hs.size());
    }
}
