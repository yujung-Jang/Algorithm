A, B, C = map(int, input().split()) # 고정 비용, 가변 비용, 노트북 가격

if B >= C:
    print(-1)
else:
    print(A // (C - B) + 1)