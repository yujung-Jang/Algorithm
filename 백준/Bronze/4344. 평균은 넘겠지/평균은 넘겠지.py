c = int(input())

for i in range(c):
    nums = list(map(int, input().split()))
    avg = sum(nums[1:]) / nums[0]
    cnt = 0
    for j in nums[1:]:
        if j > avg:
            cnt += 1
    rate = (cnt / nums[0]) * 100
    print(f'{rate:.3f}%')
          