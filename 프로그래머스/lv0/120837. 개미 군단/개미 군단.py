def solution(hp):
    
    answer = 0
    while hp:
        if hp >= 5:
            hp -= 5
            answer += 1
        elif 3 <= hp < 5:
            hp -= 3
            answer += 1
        else:
            hp -= 1
            answer += 1
    return answer