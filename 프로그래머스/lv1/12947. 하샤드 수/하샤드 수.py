def solution(x):
    
    sx = str(x)
    _sum = 0
    for i in range(len(sx)):
        _sum += int(sx[i])
    
    if x % _sum != 0:
        return False
    
    return True