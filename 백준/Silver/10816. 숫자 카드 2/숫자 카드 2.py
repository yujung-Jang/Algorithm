from collections import Counter

n = int(input()) # 가지고 있는 카드의 수
nums = list(map(int, input().split())) # 카드에 적혀 있는 정수
m = int(input()) # 가지고 있는지 구해야 할 수들의 수
m_nums = list(map(int, input().split())) # 가지고 있는지 구해야 할 수들

c = Counter(nums)

for i in m_nums:
    print(c[i], end = ' ')