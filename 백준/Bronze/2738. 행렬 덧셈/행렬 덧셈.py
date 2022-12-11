n, m = map(int, input().split())
a = []
b = []

for i in range(n):
    a_list = list(map(int, input().split()))
    a.append(a_list)
    
for i in range(n):
    b_list = list(map(int, input().split()))
    b.append(b_list)

for i in range(n):
    for j in range(m):
        print(a[i][j] + b[i][j], end = ' ')
    print()