import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        return Arrays.stream(dic)
                .anyMatch(word -> canFormWord(word, spell)) ? 1 : 2;
    }

    private boolean canFormWord(String word, String[] spell) {
        return word.chars().allMatch(c -> {
            String letter = String.valueOf((char) c);
            return Arrays.stream(spell).anyMatch(s -> s.equals(letter));
        });
    }
}
