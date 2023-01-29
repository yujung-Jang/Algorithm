def solution(n):
    return sum(map(int, [str(n)[i] for i in range(len(str(n)))]))