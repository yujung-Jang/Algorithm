def solution(lottos, win_nums):
    answer = []
    count = 0
    zero = lottos.count(0)
    rank = {0: 6, 1: 6, 2: 5, 3: 4, 4: 3, 5: 2, 6: 1}
    
    for i in range(len(lottos)):
        if lottos[i] in win_nums:
            count += 1
            
    answer.append(rank[count + zero])
    answer.append(rank[count])
    
    return answer