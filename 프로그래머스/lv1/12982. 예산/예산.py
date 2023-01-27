def solution(d, budget):
    d.sort()
    arr = []
    for i in range(len(d)):
        if sum(arr) + d[i] <= budget:
            arr.append(d[i])
    return len(arr)