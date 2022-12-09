list = []

for i in range(10):
    n = int(input())
    list.append(n % 42)

s = set(list)
print(len(s))
