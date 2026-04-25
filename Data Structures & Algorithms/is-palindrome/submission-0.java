class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char l = s.charAt(left);
            char r = s.charAt(right);

            // 1️⃣ Skip non-alphanumeric (left)
            if (!Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }

            // 2️⃣ Skip non-alphanumeric (right)
            if (!Character.isLetterOrDigit(r)) {
                right--;
                continue;
            }

            // 3️⃣ Compare lowercase
            if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            }

            // 4️⃣ Move pointers
            left++;
            right--;
        }

        return true;
    }
}