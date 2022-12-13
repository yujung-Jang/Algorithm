from collections import deque

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

graph = []

def bfs(x, y):

    queue = deque()
    queue.append((x, y))
    graph[x][y] = 0
    count = 1
    
    while queue:
        x, y = queue.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if nx < 0 or nx >= N or ny < 0 or ny >= N:
                continue
        
            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                queue.append((nx, ny))
                count += 1
     
    return count # 단지 내 집의 수

N = int(input()) # 지도의 크기

for _ in range(N):
    graph.append(list(map(int, input())))

danji = []
for i in range(N):
    for j in range(N):
        if graph[i][j] == 1:
            danji.append(bfs(i, j))

danji.sort()
print(len(danji))
for i in danji:
    print(i)