def solution(s):
    s = s.lower()
    if 'p' not in s and 'y' not in s:
        return True
    p_num = 0
    y_num = 0
    for i in s:
        if i == 'p':
            p_num += 1
        elif i == 'y':
            y_num += 1
    return p_num == y_num