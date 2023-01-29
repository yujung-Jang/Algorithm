def solution(n):
    if (n ** 0.5) == int((n ** 0.5)) and (n ** 0.5) ** 2:
        return ((n ** 0.5) + 1) ** 2
    else:
        return -1