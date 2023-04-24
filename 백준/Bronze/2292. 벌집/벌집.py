n = int(input())

cnt = 1 # 벌집의 개수
answer = 1 # 벌집 둘레의 개수
while n > cnt:
    cnt += 6 * answer
    answer += 1

print(answer)