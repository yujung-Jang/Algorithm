dialing = ["ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"]
s = input()
time = 0

for i in range(len(s)):
    for num in dialing:
        if s[i] in num:
            time += dialing.index(num) + 3
       
print(time)