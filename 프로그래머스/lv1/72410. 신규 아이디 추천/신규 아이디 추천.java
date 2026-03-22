class Solution {
	public String solution(String new_id) { // 들어오는 값, 인자 (원인이 되는 값)
		//https://school.programmers.co.kr/learn/courses/30/lessons/72410
		//2021 KAKAO BLIND RECRUITMENT 카카오 신규 아이디 추천
		String answer ="";
//		1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		new_id = new_id.toLowerCase();
//		System.out.println(new_id);
//		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		for (int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);
            if ('a' <= ch && ch <= 'z') {
            	answer += ch;
            }
            if ('0' <= ch && ch <= '9') {
            	answer += ch;
            }
            if (ch == '-' || ch == '_' || ch == '.') {
            	answer += ch;
            }
        }
//		System.out.println(answer);
//		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		while(answer.contains("..")) {
			answer = answer.replace("..", ".");
		}
//		System.out.println(answer);
//		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		if(answer.charAt(0) == '.') {
			answer = answer.substring(1);
		}
		if(answer.length() - 1 == '.') {
			answer = answer.substring(1);
		}
//		System.out.println(answer);
//		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(answer.equals("")) {
            answer = "a";
        }
//		System.out.println(answer);
//		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.		
//		     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
		if(answer.charAt(answer.length() - 1) == '.') {
			answer = answer.substring(0, answer.length()-1);
		}
//		System.out.println(answer);
//		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		
        if(answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }    
        } 
//		System.out.println(answer);
		return answer; // 함수가 종료되면서 마지막에 내놓은 값(돌려주는 값, 변환값)
	}
}