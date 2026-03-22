public class Solution {
    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        String result = solution(id_pw, db);
        System.out.println(result);
    }

    public static String solution(String[] id_pw, String[][] db) {
        String inputId = id_pw[0];
        String inputPw = id_pw[1];

        for (String[] userInfo : db) {
            String dbId = userInfo[0];
            String dbPw = userInfo[1];

            if (inputId.equals(dbId)) {
                if (inputPw.equals(dbPw)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }

        return "fail";
    }
}
