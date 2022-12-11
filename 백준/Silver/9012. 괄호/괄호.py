t = int(input())

def bracket_stack(bracket):
    stack = []
    for s in bracket:
        if s == '(':
            stack.append('(')
        elif s == ')':
            if len(stack) == 0:
                return "NO"
            else:
                stack.pop()
    if len(stack) == 0:
        return "YES"
    else:
        return "NO"

for _ in range(t):
    bracket = input()
    print(bracket_stack(bracket))