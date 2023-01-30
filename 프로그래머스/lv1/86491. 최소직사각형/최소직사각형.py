def solution(sizes):
    for i in sizes:
        if i[1] < i[0]:
            temp = i[0]
            i[0] = i[1]
            i[1] = temp
            
    w = 0
    h = 0
    for i in sizes:
        if i[0] > w:
            w = i[0]
        if i[1] > h:
            h = i[1]
    return w * h