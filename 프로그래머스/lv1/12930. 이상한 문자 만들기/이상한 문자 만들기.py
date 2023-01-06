def solution(s):
    
    answer = ""
    sr = s.split(" ")
    for i in sr:
        for j in range(len(i)):
            if j % 2 == 0:
                answer += i[j].upper()
            else:
                answer += i[j].lower()
        answer += " "
    return answer[0:-1]
            