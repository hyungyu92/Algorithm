package algorithm.programmers.level1;

public class Solution_평균구하기 {
	public double solution(int[] arr) {
		double answer = 0;
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		answer = sum/arr.length;

		return answer;
	}
}
