4
50 4
20 4
40 3
10 1

루프 진행 과정
i = 4:

j = 0:
ar.get(0).date = 4 >= 4 → if (4 < 4) 거짓 → pQ.offer(50)
j = 1:
ar.get(1).date = 4 >= 4 → if (4 < 4) 거짓 → pQ.offer(20)
j = 2:
ar.get(2).date = 3 < 4 → if (3 < 4) 참 → break
pQ: [50, 20]
선택된 money: 50 → answer = 50
i = 3:

j = 2:
ar.get(2).date = 3 >= 3 → if (3 < 3) 거짓 → pQ.offer(40)
j = 3:
ar.get(3).date = 1 < 3 → if (1 < 3) 참 → break
pQ: [20, 40]
선택된 money: 40 → answer = 90
i = 2:

j = 3:
ar.get(3).date = 1 < 2 → if (1 < 2) 참 → break
pQ: [20]
선택된 money: 20 → answer = 110
i = 1:

j = 3:
ar.get(3).date = 1 >= 1 → if (1 < 1) 거짓 → pQ.offer(10)
j = 4 (루프 종료)
pQ: [10]
선택된 money: 10 → answer = 120