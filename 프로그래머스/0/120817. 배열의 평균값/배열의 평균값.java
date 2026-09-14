class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int avg = 0;
        for(int i : numbers) {
            answer += i;
            avg += 1;
        }
        answer /= avg;
        return answer;
    }
}