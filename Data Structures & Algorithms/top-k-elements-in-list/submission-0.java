class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        HashMap<Integer, Integer> res = new HashMap<>();

        for(int c: nums){
            res.put(c, res.getOrDefault(c, 0)+1);
        }

        ArrayList<Integer> arr = new ArrayList<>(res.keySet());

        arr.sort((a,b)-> res.get(b) - res.get(a));

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = arr.get(i);
        }
return result;
    }
}
