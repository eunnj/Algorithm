class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int left = section[0];
        int right = section[section.length - 1];

        while (left <= right) {
            int len = left + m - 1; // 롤러의 오른쪽 끝 위치 계산
            answer++;

            if (len >= right) {
                break; // 범위 밖으로 나갈 경우 종료
            }

            // 다음 구역으로 이동
            int nextSection = -1;
            for (int i = section.length - 1; i >= 0; i--) {
                if (section[i] > len) {
                    nextSection = section[i];
                }
            }

            if (nextSection == -1) {
                left = len + 1; // 롤러의 오른쪽 끝 위치 다음부터 다시 시작
            } else {
                left = nextSection; // 다음 구역의 시작으로 이동
            }

            if (left > n) {
                break; // 범위 밖으로 나갈 경우 종료
            }
        }

        return answer;
    }
}
