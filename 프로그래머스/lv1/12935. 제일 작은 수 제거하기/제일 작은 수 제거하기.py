def solution(arr):
    min_n = min(arr)
    answer = []
    for i in arr:
        if i != min_n:
            answer.append(i)
    return answer if len(answer) != 0 else [-1]