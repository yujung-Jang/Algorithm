n, m = map(int, input().split())
ball = [0] * (n + 1)

for a in range(m):
    i, j, k = map(int, input().split())
    for b in range(i, j + 1):
        ball[b] = k

for i in range(1, len(ball)):
    print(ball[i], end = ' ')