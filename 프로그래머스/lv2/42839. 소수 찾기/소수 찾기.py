from itertools import permutations

def solution(numbers):
    numbers = list(numbers)
    answer = []
    for i in range(1, len(numbers) + 1):
        for n in permutations(numbers, i):
            if is_prime(int(''.join(n))) and int(''.join(n)) not in answer:
                answer.append(int(''.join(n)))
    return len(answer)

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True