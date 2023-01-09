def solution(emergency):
    
    _sort = sorted(emergency, reverse = True)
    answer = [_sort.index(i) + 1 for i in emergency]
    return answer