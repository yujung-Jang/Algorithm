def solution(my_string):
    _sum = 0
    for i in my_string:
        if i in '0123456789':
            _sum += int(i)
    return _sum