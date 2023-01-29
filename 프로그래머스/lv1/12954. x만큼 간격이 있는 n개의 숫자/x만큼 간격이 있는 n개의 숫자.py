def solution(x, n):
    if n == 0:
        return []
    if x == 0:
        return [0 for _ in range(n)]
    if x < 0:
        return [i for i in range(x, x * n - 1, x)]
    else:
        return [i for i in range(x, x * n + 1, x)]