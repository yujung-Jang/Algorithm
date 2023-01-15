def solution(s):
    
    _list = s.split(" ")
    _list.append('0')
    _sum = 0
    for i in range(len(_list) - 1):
         if _list[i] != 'Z' and _list[i + 1] != 'Z':
                _sum += int(_list[i])
    return _sum