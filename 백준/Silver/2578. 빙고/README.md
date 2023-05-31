# [Silver IV] 빙고 - 2578 

[문제 링크](https://www.acmicpc.net/problem/2578) 

### 성능 요약

메모리: 14320 KB, 시간: 124 ms

### 분류

구현, 시뮬레이션

### 문제 설명

<p>빙고 게임은 다음과 같은 방식으로 이루어진다.</p>

<p>먼저 아래와 같이 25개의 칸으로 이루어진 빙고판에 1부터 25까지 자연수를 한 칸에 하나씩 쓴다</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5e2e03f0-5561-43c3-9b65-a752837732ef/-/preview/" style="width: 179px; height: 167px;"></p>

<p>다음은 사회자가 부르는 수를 차례로 지워나간다. 예를 들어 5, 10, 7이 불렸다면 이 세 수를 지운 뒤 빙고판의 모습은 다음과 같다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6fc024b4-5bf7-42de-b303-406db2e3ff5b/-/preview/" style="width: 179px; height: 167px;"></p>

<p>차례로 수를 지워가다가 같은 가로줄, 세로줄 또는 대각선 위에 있는 5개의 모든 수가 지워지는 경우 그 줄에 선을 긋는다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b5ffac7e-7db4-4d54-bf2b-63ac7d6807d8/-/preview/" style="width: 218px; height: 218px;"></p>

<p>이러한 선이 세 개 이상 그어지는 순간 "빙고"라고 외치는데, 가장 먼저 외치는 사람이 게임의 승자가 된다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f86e3bcc-54da-420a-8f06-9600cb06eeaa/-/preview/" style="width: 237px; height: 218px;"></p>

<p>철수는 친구들과 빙고 게임을 하고 있다. 철수가 빙고판에 쓴 수들과 사회자가 부르는 수의 순서가 주어질 때, 사회자가 몇 번째 수를 부른 후 철수가 "빙고"를 외치게 되는지를 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄부터 다섯째 줄까지 빙고판에 쓰여진 수가 가장 위 가로줄부터 차례대로 한 줄에 다섯 개씩 빈 칸을 사이에 두고 주어진다. 여섯째 줄부터 열째 줄까지 사회자가 부르는 수가 차례대로 한 줄에 다섯 개씩 빈 칸을 사이에 두고 주어진다. 빙고판에 쓰여진 수와 사회자가 부르는 수는 각각 1부터 25까지의 수가 한 번씩 사용된다.</p>

### 출력 

 <p>첫째 줄에 사회자가 몇 번째 수를 부른 후 철수가 "빙고"를 외치게 되는지 출력한다.</p>

