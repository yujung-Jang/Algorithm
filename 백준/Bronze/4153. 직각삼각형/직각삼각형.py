while True:
    triangle = sorted(map(int, input().split()))
    if sum(triangle) == 0:
        break
    if triangle[2] ** 2 == (triangle[0] ** 2 + triangle[1] ** 2):
        print("right")
    else:
        print("wrong")