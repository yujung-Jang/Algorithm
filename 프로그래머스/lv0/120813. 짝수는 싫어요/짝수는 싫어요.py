def solution(n):
    if n % 2 == 0:
        n -= 1
    answer = [i for i in range(1, n + 2, 2)]
    return answer