# 최단거리: BFS
import sys
from collections import deque

input = sys.stdin.readline

M, N, H = map(int, input().split()) # 가로, 세로, 상자 수
box = [[list(map(int, input().split())) for _ in range(N)] for _ in range(H)]
visited = [[[False] * M for _ in range(N)] for _ in range(H)]

dx = [0, 0, -1, 1, 0, 0] # 상, 하, 좌, 우, 앞, 뒤
dy = [1, -1, 0, 0, 0, 0]
dz = [0, 0, 0, 0, 1, -1]

queue = deque()
for i in range(H):
    for j in range(N):
        for k in range(M):
            if box[i][j][k] == 1:
                queue.append((i, j, k))

def bfs():
    while queue:
        x, y, z = queue.popleft()
        for i in range(6):
            nx = x + dx[i]
            ny = y + dy[i]
            nz = z + dz[i]
            
            if nx < 0 or nx >= H or ny < 0 or ny >= N or nz < 0 or nz >= M:
                continue
            
            if box[nx][ny][nz] == 0 and not visited[nx][ny][nz]:
                visited[nx][ny][nz] = True
                box[nx][ny][nz] = box[x][y][z] + 1
                queue.append((nx, ny, nz))

bfs()

tomato_max = 0
for i in box:
    for j in i:
        for k in j:
            if k == 0:
                print(-1)
                exit(0)
        tomato_max = max(tomato_max, max(j))

print(tomato_max - 1)