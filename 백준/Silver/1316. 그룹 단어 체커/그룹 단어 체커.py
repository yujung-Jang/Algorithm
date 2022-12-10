n = int(input())
count = 0

for i in range(n):
    s = input()
    b = True
    for j in range(len(s) - 1):
        if s[j] != s[j + 1]:
            if s[j] in s[j + 1:]:
                b = False
                break
    if b:
        count += 1

print(count)