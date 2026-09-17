class Solution {
    boolean solution(String s) {
        String lower = s.toLowerCase();
        long p = lower.chars().filter(c -> c == 'p').count();
        long y = lower.chars().filter(c -> c == 'y').count();
        return p == y;
    }
}