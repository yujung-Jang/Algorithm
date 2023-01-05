from collections import Counter

def solution(array):
    cnt = Counter(array).most_common()
    
    if len(cnt) > 1 and cnt[0][1] == cnt[1][1]:
        return -1
    
    return cnt[0][0]