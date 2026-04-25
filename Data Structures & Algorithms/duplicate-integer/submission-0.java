class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();

        for(int c: nums){
            if(!hash.contains(c)){
            hash.add(c);
            }else{
                return true;
            }

        }

return false;

    }
}