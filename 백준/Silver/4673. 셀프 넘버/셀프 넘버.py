numbers = list(range(1, 10001))
remove_list = []
for i in numbers:
    for j in str(i):
        i += int(j)
    if i <= 10000:
        remove_list.append(i)
for remove_num in set(remove_list):
    numbers.remove(remove_num)
for self_num in numbers:
    print(self_num)