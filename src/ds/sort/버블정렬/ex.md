1. 첫 번째 인덱스부터 시작해서 첫 번째 요소와 두 번째 요소를 비교한다.
2. 첫 번째 요소가 두 번째 요소보다 크면 서로 교체된다.
3. 이제 두 번째 요소와 세 번째 요소를 비교해 보자. 순서가 맞지 않으면 교환한다.
4. 이 과정이 마지막 요소까지 계속된다.

이 과정을 반복하면 가장 큰 요소가 배열의 끝으로 '버블처럼' 올라간다. 그래서 버블정렬


## 2. 버블 정렬
   설명

N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

정렬하는 방법은 버블정렬입니다.


입력

첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.


출력

오름차순으로 정렬된 수열을 출력합니다.


예시 입력 1

6
13 5 11 7 23 15
예시 출력 1

5 7 11 13 15 23