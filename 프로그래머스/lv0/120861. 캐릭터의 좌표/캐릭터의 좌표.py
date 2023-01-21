def solution(keyinput, board):
    col = board[0] # 보드 가로 길이
    row = board[1] # 보드 세로 길이
    answer = [0, 0]
    
    for i in keyinput:
        if i == "left" and answer[0] - 1 >= -(col // 2):
            answer[0] -= 1
        elif i == "right" and answer[0] + 1 <= (col // 2):
            answer[0] += 1
        elif i == "up" and answer[1] + 1 <= (row // 2):
            answer[1] += 1
        elif i == "down" and answer[1] - 1 >= -(row // 2):
            answer[1] -= 1
    return answer