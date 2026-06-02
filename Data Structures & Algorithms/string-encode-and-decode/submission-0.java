class Solution {

    public String encode(List<String> strs) {
      
        StringBuilder sb = new StringBuilder();
        for( String s: strs){
           
        sb.append(s.length());
        sb.append("#");
        sb.append(s);

        }
        String res = sb.toString();
    return res;


    }

    public List<String> decode(String str) {
          List<String> strs = new ArrayList<>();

        int left = 0;

        while (left < str.length()) {

            int right = left;

            while (str.charAt(right) != '#') {
                right++;
            }

            int len = Integer.parseInt(str.substring(left, right));

            String res = str.substring(
                right + 1,
                right + 1 + len
            );

            strs.add(res);

            left = right + 1 + len;
        }

        return strs;
    }
}
