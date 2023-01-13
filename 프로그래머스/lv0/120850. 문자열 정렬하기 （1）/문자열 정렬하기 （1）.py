def solution(my_string):
    
    _list = []
    for i in my_string:
        if i in '0123456789':
            _list.append(int(i))
    _list.sort()
    
    return _list