def solution(array):
    answer = []
    s_array = sorted(array)
    max_num = s_array[len(s_array) - 1]
    answer.append(max_num)
    answer.append(array.index(max_num))
    return answer