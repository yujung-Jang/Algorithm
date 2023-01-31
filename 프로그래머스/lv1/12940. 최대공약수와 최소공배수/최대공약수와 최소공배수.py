def solution(n, m):
    # 유클리드 호제법: x와 y의 최대 공약수와 y와 x % y의 최대 공약수와 같다
    # 최소 공배수는 n * m를 최대 공약수로 나눈 몫이다
    x, y = max(n, m), min(n, m)
    i = 1
    while i > 0:
        i = x % y
        x, y = y, i
    return [x, int(n * m / x)]