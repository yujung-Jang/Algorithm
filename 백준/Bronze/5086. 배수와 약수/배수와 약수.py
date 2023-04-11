while True:
    a, b = map(int, input().split())
    if a != 0 and b != 0:
        if b % a == 0: # 첫 번째 숫자가 두 번째 숫자의 약수일 때
            print("factor")
        elif a % b == 0: # # 첫 번째 숫자가 두 번째 숫자의 배수일 때
            print("multiple")
        else: # 둘 다 아닐 때
            print("neither")
    else:
        exit(0)