def solution(polynomial):
    polynomial = polynomial.split(' + ')
    x = 0
    num = 0
    for i in polynomial:
        if i.isdigit():
            num += int(i)
        elif not i.isdigit() and len(i) >= 2:
            x += int(i[0:-1])
        elif not i.isdigit() and len(i) == 1:
            x += 1

    if x == 0:
        return str(num)
    elif x == 1 and num == 0:
        return 'x'
    elif x == 1:
        return 'x + ' + str(num) 
    elif x >= 2 and num != 0:
        return str(x) + 'x + ' + str(num)
    elif x >= 2 and num == 0:
        return str(x) + 'x'