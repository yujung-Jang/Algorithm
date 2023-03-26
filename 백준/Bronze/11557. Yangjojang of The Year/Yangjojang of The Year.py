t = int(input())
for _ in range(t):
    n = int(input()) # 학교의 숫자
    max_num = -1
    max_name = ""
    for _ in range(n):
        s, l = input().split() # 학교 이름, 소비한 술의 양
        if max_num < int(l): # 기록된 수보다 더 크다면 새로 기록
            max_num = int(l)
            max_name = s
    print(max_name)