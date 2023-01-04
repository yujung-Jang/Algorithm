from fractions import Fraction

def solution(denum1, num1, denum2, num2):
    answer = []
    denum = Fraction(denum1, num1) + Fraction(denum2, num2)
    answer.append(denum.numerator)
    answer.append(denum.denominator)
    return answer