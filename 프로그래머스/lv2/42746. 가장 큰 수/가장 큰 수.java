import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] num) {
        String[] strNums = new String[num.length];

        for (int i = 0; i < num.length; i++) {
        	strNums[i] = String.valueOf(num[i]);
        }

        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        if (strNums[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();
        for (String strNum : strNums) {
            answer.append(strNum);
        }

        return answer.toString();
    }
}
