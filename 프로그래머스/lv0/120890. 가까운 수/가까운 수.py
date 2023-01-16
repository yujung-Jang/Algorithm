def solution(array, n):
    result = lambda a, n: sorted(a, key = lambda x: (abs(x - n), x))[0]
    return result(array, n)