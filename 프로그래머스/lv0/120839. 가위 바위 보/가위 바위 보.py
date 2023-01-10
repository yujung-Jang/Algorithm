def solution(rsp):
    
    _rsp = {'2':'0', '0':'5', '5':'2'}
    return "".join(map(str, [_rsp[i] for i in rsp]))