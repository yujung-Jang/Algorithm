# 유크리드 호제법
# 최대 공약수
def GCD(x, y):
    while(y):
        x, y = y, x % y
    return x

# 최소 공배수
def LCM(x, y):
    result = (x * y) // GCD(x, y)
    return result

N, M = map(int, input().split())
print(GCD(N, M))
print(LCM(N, M))