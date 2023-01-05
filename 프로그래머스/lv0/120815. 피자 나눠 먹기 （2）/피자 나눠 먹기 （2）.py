def solution(n):
    
    pizza = 6
    cnt = 1
    
    while True:
        if pizza * cnt % n == 0:
            return cnt
        else:
            cnt += 1