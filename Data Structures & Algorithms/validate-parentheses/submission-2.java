class Solution {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(c[i] == '(' || c[i] =='{' || c[i] == '['){
                stk.push(c[i]);
            }else{
                if(stk.isEmpty()){
                    return false;
                }
                if((c[i] == ']' && stk.peek() == '[') || (c[i] == ')' && stk.peek()== '(') || (c[i] == '}' && stk.peek() == '{')){

                
                    stk.pop();

                }else{
                    return false;
                }
            }
        }
       return stk.isEmpty();

    }
 
}
