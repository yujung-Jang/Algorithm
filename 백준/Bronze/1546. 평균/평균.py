n = int(input())
list = list(map(int, input().split()))

m = max(list)

sum = 0
for i in range(n):
    sum += list[i] / m * 100

print(sum / n)