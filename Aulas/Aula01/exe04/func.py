def OrdenarVetor(x:list, y:list):
    r = []
    tam = len(x) + len(y)
    temp = 0
    for i in range(tam):
        if(len(x) == 0): temp = y
        
        elif(len(y) == 0):  temp = x

        elif(x[0] < y[0]): temp = x

        elif(x[0] > y[0]): temp = y
        else: temp = x
        r.append(temp[0])
        temp.pop(0)
    
    return r
