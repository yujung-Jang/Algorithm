num = int(input())
s_list = [[0 for i in range(101)] for j in range(101)]
result = 0

for i in range(num):
    n, m = map(int, input().split())
    for j in range(n, n + 10):
        for k in range(m, m + 10):
            s_list[j][k] = 1

for i in s_list:
    result += i.count(1)

print(result)