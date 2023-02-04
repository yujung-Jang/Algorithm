def solution(s, n):
    s = list(s)
    for i in range(len(s)):
        if s[i].isupper():
            # A와 현재 알파벳의 유니코드 차를 구하고, n을 더한 후 26(알파벳 개수)으로 나눈 나머지를 구한다
            # 해당 수에서 A에 해당하는 위치를 더한 후 chr로 변환하면 알파벳이 된다
            s[i] = chr((ord(s[i]) - ord('A') + n) % 26 + ord('A'))
        elif s[i].islower():
            s[i] = chr((ord(s[i]) - ord('a') + n) % 26 + ord('a'))
    return ''.join(s)