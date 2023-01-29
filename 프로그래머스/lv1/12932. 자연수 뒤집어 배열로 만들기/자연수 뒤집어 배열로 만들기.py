def solution(n):
    return [int(str(n)[-i]) for i in range(1, len(str(n)) + 1)]