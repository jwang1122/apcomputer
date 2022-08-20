def toSeconds(time):
    data = time.split("'")
    return int(data[0])*60 + int(data[1][:-1])

with open('history1.csv','w+') as out:
    i = 0
    with open('history.csv', 'r') as ap:
        for row in ap:
            if i==0:
                out.write(row)
            data = row.split(',')
            if(i>0):
                print(toSeconds(data[2]))
                out.write(data[0]+','+data[1]+','+str(toSeconds(data[2]))+"\n")
            if i==0: i+=1

