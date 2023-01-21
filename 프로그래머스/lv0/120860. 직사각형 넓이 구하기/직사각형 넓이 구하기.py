def solution(dots):
    x = abs(max(i[0] for i in dots) - min(i[0] for i in dots))
    y = abs(max(i[1] for i in dots) - min(i[1] for i in dots))
    return x * y