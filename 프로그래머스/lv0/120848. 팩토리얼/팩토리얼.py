import sys
sys.setrecursionlimit(10 ** 6)

def solution(n):
    answer = 0
    factorial = 1
    for i in range(1, n + 1):
        factorial *= i
        if factorial <= n:
            answer = i
        if factorial > n:
            return answer
    return answer
    