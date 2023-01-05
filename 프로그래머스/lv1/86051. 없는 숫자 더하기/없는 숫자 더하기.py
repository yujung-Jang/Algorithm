def solution(numbers):
    
    _sum = 0
    for i in range(10):
        if i not in numbers:
            _sum += i
    return _sum