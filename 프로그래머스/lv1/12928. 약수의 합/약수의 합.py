def solution(n):
    answer = [1]
    if n == 0:
        return 0
    if n == 1:
        return 1
    for i in range(2, n + 1):
        if n % i == 0:
            answer.append(i)
    return sum(answer)