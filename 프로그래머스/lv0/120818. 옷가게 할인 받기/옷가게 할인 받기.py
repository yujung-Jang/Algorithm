def solution(price):
    
    if price >= 500000:
        return int(price - price * (20 / 100))
    elif price >= 300000:
        return int(price - price * (10 / 100))
    elif price >= 100000:
        return int(price - price * (5 / 100))
    else:
        return price