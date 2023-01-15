T = int(input())

def plus(n):
    if n == 1:
        return 1
    elif n == 2:
        return 2
    elif n == 3:
        return 4
    else: # n번째 경우의 수는 n - 1, n - 2, n - 3 경우의 수의 합과 같다
        return plus(n - 1) + plus(n - 2) + plus(n - 3)

for i in range(T):
    n = int(input())
    print(plus(n))
    