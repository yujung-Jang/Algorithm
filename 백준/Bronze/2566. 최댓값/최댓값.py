result = []
max_num = 0
row = 0
col = 0

for i in range(9):
    result.append(list(map(int, input().split())))

for i in range(9):
    if max_num < max(result[i]):
        max_num = max(result[i])
        row = result[i].index(max(result[i]))
        col = i

print(max_num)
print(col + 1, row + 1)
        