def solution(n):
    def convert(num, base):
        power = 0
        tmp = ''
        while num:
            tmp = str(num % base) + tmp
            num //= base
        return tmp
    return int(convert(n, 3)[::-1], 3)