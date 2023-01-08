N = int(input())
nums = list(map(int, input().split()))
answer = 0

for i in nums:
    cnt = 0
    if i == 1: # 1은 소수가 아니다
        continue
    for j in range(2, i + 1):
        if i % j == 0: # 나누어 떨어지는 약수일 경우 + 1
            cnt += 1
    if cnt == 1: # 자기 자신만을 약수로 가지면 소수이다
        answer += 1

print(answer)