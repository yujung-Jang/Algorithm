def solution(answers):
    c1 = [1, 2, 3, 4, 5]
    c2 = [2, 1, 2, 3, 2, 4, 2, 5]
    c3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    s1, s2, s3 = 0, 0, 0 # 각 학생의 정답 수
    for i in range(len(answers)):
        o1 = i % 5
        o2 = i % 8
        o3 = i % 10
        
        if answers[i] == c1[o1]:
            s1 += 1
        if answers[i] == c2[o2]:
            s2 += 1
        if answers[i] == c3[o3]:
            s3 += 1
    
    g = max(s1, s2, s3)
    answer = []
    if s1 == g:
        answer.append(1)
    if s2 == g:
        answer.append(2)
    if s3 == g:
        answer.append(3)
        
    return sorted(answer) if len(answer) != 1 else answer