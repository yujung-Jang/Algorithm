while True:
    now = input()
    if now == '0':
        break
    if now == now[::-1]:
        print("yes")
    else:
        print("no")