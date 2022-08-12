def getPair1(mushrooms):
    a,b=0,0
    for i in mushrooms:
        if i==mushrooms[0]:
            a += 1
        else:
            b += 1
    return min(a,b)

def getPair(mushroom1, mushroom2):
    return mushroom1==mushroom2 and 1 or 0

def countMushrooms(mushrooms):
    a = 1
    for i in range(1, len(mushrooms)):
        a += getPair(mushrooms[0], mushrooms[i])
    return a

