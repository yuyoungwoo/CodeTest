class Solution {
	public int solution(int[] array) {
		int answer = 0;
		int max = 0;
		
		// 원소의 최대값을 먼저 구하고, 그 길이만큼의 배열을 생성하여 횟수체크에 사용한다		.
		// 이 과정을 생략하고 싶다면 길이 1001의 배열을 생성하면 된다.
		// +1 이 들어가는 이유는 0부터 시작하는 index의 특성상 계산이 번거로워져서
		int[] counts = new int[1001]; // { 0, 0, 0, 0, 0, ... 0, 0 }
		
		for(int i = 0; i < array.length; i++) {
			counts[array[i]]++;
			if(max < counts[array[i]]) {
				max = counts[array[i]];
				answer = array[i];
			}
		}
		// 최빈값이 두개일때 answer의 값은 -1이 된다.
		int num = 0;
		for(int j = 0; j < 1001; j++) {
			if(max == counts[j]) {
				num++;
				if(num > 1) {
				answer = -1;
				}
			}
		}
		/*
		for(int i = 0; i < array.length; i++ ) { // 배열에 해당하는 counts 값 증가
			counts[array[i]]++;
			if(index < counts[array[i]]) { // 값이 index보다 크면 최빈값
				index = counts[array[i]];
				answer = array[i];
			}
		}
		// 최빈값이 두개일때 answer의 값은 -1이 된다.
		 if() {
		 	answer = -1;
		}
		*/
		
		// 최빈값을 answer에 담아서 변환하면 된다
		// 1) array에서 가장 많이 등장한 값을 찾아야 한다
		// 2) array의 각 값이 등장한 횟수를 체크해야 한다
		// 횟수에서 최대값을 찾아서 가장 많이 등장한 값을 answer에 담는다
		// 횟수에서 최대값이 중복된다면 answer에 -1을 담는다.
		
		return answer;
	}
}