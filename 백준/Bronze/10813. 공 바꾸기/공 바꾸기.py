n, m = map(int, input().split()) # 바구니의 개수, 공을 바꾸는 횟수
basket = list(range(1, n + 1))

for _ in range(m):
    i, j = map(int, input().split())
    temp = basket[i - 1]
    basket[i - 1] = basket[j - 1]
    basket[j - 1] = temp

print(*basket)