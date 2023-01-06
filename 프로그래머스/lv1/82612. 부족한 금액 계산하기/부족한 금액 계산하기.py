def solution(price, money, count):
    
    N = 1
    _sum = 0
    for i in range(1, count + 1):
        _sum += price * N
        N += 1
    
    if _sum > money:
        return _sum - money
    else:
        return 0