n = int(input())
hansu = 0

for i in range(1, n + 1):
    num_list = list(map(int, str(i)))
    if i < 100:
        hansu += 1
    elif (num_list[1] - num_list[0]) == (num_list[2] - num_list[1]):
        hansu += 1

print(hansu)