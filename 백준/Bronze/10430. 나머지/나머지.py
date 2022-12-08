num = list(map(int, input().split()))

a, b, c = num

print((a + b) % c)
print(((a % c) + (b % c)) % c)
print((a * b) % c)
print((a % c) * (b % c) % c)