def solution(my_string, num1, num2):
    ms = list(my_string)
    ms[num1], ms[num2] = ms[num2], ms[num1]
    return ''.join(ms)