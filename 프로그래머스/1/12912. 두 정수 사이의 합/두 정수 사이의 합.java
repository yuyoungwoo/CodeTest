class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            for(int i = b; i <= a; i++) {
                answer += b;
                b += 1;
                }
            } else {
                for(int j = a; j <= b; j++) {
                    answer += a;
                    a += 1;
                }
            }
                return answer;
        }
        
}