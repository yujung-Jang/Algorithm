t = int(input())
arr = [int(input()) for _ in range(t)]

for i in range(t):
    b = str(bin(arr[i]))[::-1]
    for j in range(len(b)):
        if b[j] == '1':
            print(j, end = ' ')