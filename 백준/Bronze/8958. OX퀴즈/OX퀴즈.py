n = int(input())

for i in range(n):
    s = input()
    num = 0
    score = 0
    for j in range(len(s)):
        if s[j] == 'O':
            num += 1
            score += num
        elif s[j] == 'X':
            num = 0
    print(score)