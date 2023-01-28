t = int(input())
arr = [int(input()) for _ in range(t)]

for i in range(t):
    now = arr[i]
    j = 0
    while now != 0:
        if now % 2 == 1:
            print(j, end = ' ')
        now //= 2
        j += 1