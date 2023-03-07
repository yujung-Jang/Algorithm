n = int(input()) # 시험장의 개수
a = list(map(int, input().split())) # 각 시험장에 있는 응시자 수
b, c = map(int, input().split())

answer = 0
for i in range(n):
    a[i] -= b
    answer += 1

for i in range(n):
    if a[i] > 0:
        answer += a[i] // c
        if a[i] % c != 0:
            answer += 1
            
print(answer)