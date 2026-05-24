class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Create an HashMap
        HashMap<String, List<String>> freq = new HashMap<>();
        //get the strings array
        for( String s: strs){
            //create an count array which have occurance of the character eg[101000...]
            int[] count = new int[26];
            // convert that string into chracter and store the count in array
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }

            //convert the freq signature into key using string
            String key = Arrays.toString(count);

            //check if the word already in table else put the key signature
            //and the new arraylist to store the words
            if(!freq.containsKey(key)){
                freq.put(key, new ArrayList<>());
            }
            //add the word to the table signature array list
            freq.get(key).add(s);


        }
            return new ArrayList<>(freq.values());

        }

    
}
