def solution(s):
    
    '''
    1. s를 공백을 기준으로 나눈 리스트 A를 만든다. (split())
    2. map을 통해 A의 각 요소에 접근하여 lambda 함수를 적용한다. (대소문자 전환)
    3. 리스트 A를 공백으로 구분하여 하나의 문자로 만든다. (join())
    '''
    return ' '.join(map(lambda x: ''.join([n.lower() if i % 2 else n.upper() for i, n in enumerate(x)]), s.split(' ')))
            