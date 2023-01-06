N = int(input()) # N * N인 체스판, N개의 퀸

chess = [0] * N # 인덱스: 행, 값: 열
answer = 0

# 퀸을 놓을 수 있는지 검사
def is_promising(row):

    for i in range(row):
        # 같은 열에 다른 퀸이 있는 경우 or 대각선에 다른 퀸이 있는 경우
        if chess[row] == chess[i] or abs(chess[row] - chess[i]) == abs(row - i):
            return False
    return True

def queen(row):
    
    global answer
    if row == N:
        answer += 1
        return
    
    else:
        for i in range(N):
            chess[row] = i # [n, 1]에 퀸을 놓는다
            if is_promising(row):
                queen(row + 1)

queen(0)
print(answer)