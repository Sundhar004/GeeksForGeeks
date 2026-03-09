class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i=1; i<s.length(); i++)
        {
            int a = s.charAt(i)-'a';
            int b = s.charAt(i-1)-'a';
            sum+=Math.abs(a-b);
        }
        return sum;
    }
}
