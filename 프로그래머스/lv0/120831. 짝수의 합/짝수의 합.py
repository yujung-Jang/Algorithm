def solution(n):
    _sum = 0
    for i in range(1, n + 1):
        if i % 2 == 0:
            _sum += i
    
    return _sum